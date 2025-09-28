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
package de.jena.mdo.graphql.query.datafetcher;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.ComponentServiceObjects;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

/**
 * 
 * @author ungei
 * @since 23 Jun 2022
 */
public class AllDataFetcher implements DataFetcher<List<EObject>> {

	private ComponentServiceObjects<EMFRepository> repo;
	private EClass eClass;

	/**
	 * Creates a new instance.
	 */
	public AllDataFetcher(ComponentServiceObjects<EMFRepository> repo, EClass eClass) {
		this.repo = repo;
		this.eClass = eClass;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see graphql.schema.DataFetcher#get(graphql.schema.DataFetchingEnvironment)
	 */
	@Override
	public List<EObject> get(DataFetchingEnvironment environment) throws Exception {
		EMFRepository repository = repo.getService();
		List<EObject> result = new ArrayList<>();
		try {
			result.addAll(repository.getAllEObjects(eClass));
		} finally {
			repo.ungetService(repository);
		}
		return result;
	}

}
