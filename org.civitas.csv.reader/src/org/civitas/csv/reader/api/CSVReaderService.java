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
package org.civitas.csv.reader.api;

import java.io.InputStream;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * 
 * @author ilenia
 * @since Sep 23, 2025
 */
@ProviderType
public interface CSVReaderService {
	
	List<EObject> loadEObjectsFromCSV(String csvFilePath, EClass rootObject);

  List<EObject> loadEObjects(InputStream in, EClass rootObject);

}
