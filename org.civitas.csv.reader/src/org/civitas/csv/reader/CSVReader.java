/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.civitas.csv.reader;

import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.civitas.csv.reader.api.CSVReaderService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.codec.csv.resource.CSVResourceFactory;
import org.eclipse.fennec.codec.options.CodecResourceOptions;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, name = "CSVReader", service = CSVReaderService.class)
public class CSVReader implements CSVReaderService{

	@Reference
	CSVResourceFactory resourceFactory;

	private static final Logger LOGGER = Logger.getLogger(CSVReader.class.getName());

	/* 
	 * (non-Javadoc)
	 * @see org.civitas.csv.reader.api.CSVReaderService#loadEObjectsFromCSV(java.lang.String, org.eclipse.emf.ecore.EClass)
	 */
	@Override
	public List<EObject> loadEObjectsFromCSV(String csvFilePath, EClass rootObject) {
	  List<String> csvRowStringList = getCSVRowStringList(csvFilePath);
	  return read(rootObject, csvRowStringList);
	}

	private List<EObject> read(EClass rootObject, List<String> csvRowStringList) {
    Map<String, Object> properties = new HashMap<>();
	  properties.put(CodecResourceOptions.CODEC_ROOT_OBJECT, rootObject);
	  List<EObject> results = new ArrayList<>(csvRowStringList.size());
	  for(String row : csvRowStringList) {
	    Resource resource = resourceFactory.createResource(URI.createURI(UUID.randomUUID().toString()+".csv"));			
	    try {
	      resource.load(new ByteArrayInputStream(row.getBytes()), properties);
	      if(!resource.getContents().isEmpty()) {
	        if(resource.getContents().get(0).eClass() != rootObject) {
	          LOGGER.warning(String.format("Root Object loaded from CSVResource is not of type %s but of type %s", rootObject.getInstanceClass(), resource.getContents().get(0).eClass().getInstanceClassName()));
	        } else {
	          results.add(resource.getContents().get(0));
	        }					
	      } else {
	        LOGGER.warning(String.format("No content in loaded CSVResource for row %s", row));
	      }
	    } catch (IOException e) {
	      LOGGER.severe("IOExeption while loading CSV row into EObject");
	      e.printStackTrace();
	    }
	  }
	  return results;
  }

  /* 
   * (non-Javadoc)
   * @see org.civitas.csv.reader.api.CSVReaderService#loadEObjects(java.io.InputStream, org.eclipse.emf.ecore.EClass)
   */
  @Override
	public List<EObject> loadEObjects(InputStream in, EClass rootObject) {
	  List<String> csvRowStringList = getCSVRowStringList(in);
    return read(rootObject, csvRowStringList);
	}

	private List<String> getCSVRowStringList(String csvFilePath) {
	  try(Reader reader = new FileReader(csvFilePath);){
	    return getCSVRowStringList(reader);
    } catch (IOException e) {
      LOGGER.log(Level.SEVERE, String.format("Error reading CSV file %s: ", csvFilePath), e);
      e.printStackTrace();
      return Collections.emptyList();
    }
	}

	private List<String> getCSVRowStringList(InputStream in) {
	  try(Reader reader = new InputStreamReader(in);){
	    return getCSVRowStringList(reader);
	  } catch (IOException e) {
	    LOGGER.severe(String.format("IOExeption reading InputStream"));
	    e.printStackTrace();
	    return Collections.emptyList();
	  }
	}
	
	private List<String> getCSVRowStringList(Reader reader) {
		try (CSVParser csvParser = CSVParser.parse(reader, CSVFormat.DEFAULT.builder().setHeader().get());) {

			List<String> csvRowStringList = new LinkedList<>();

			// You can get the headers if needed:
			Map<String, Integer> headers = csvParser.getHeaderMap();

			// Iterate over each record (row) in the CSV file
			for (CSVRecord csvRecord : csvParser.getRecords()) {
				StringBuilder sb = new StringBuilder();
				// Iterate through the headers to get the key-value pairs
				for (String header : headers.keySet()) {
					// Use the header to get the corresponding value from the record
					String value = csvRecord.get(header);
					sb.append(header+"="+value+"&");
				}
				csvRowStringList.add(sb.toString().substring(0, sb.toString().length()-1));
			}
			return csvRowStringList;
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, String.format("Error parsing csv: %s", e.getMessage()), e);
			return Collections.emptyList();
		}
	}

}
