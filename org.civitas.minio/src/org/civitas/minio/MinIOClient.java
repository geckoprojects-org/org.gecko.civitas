/*
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
 *      Mark Hoffmann - initial API and implementation
 */
package org.civitas.minio;

import java.io.InputStream;
import java.util.List;

import io.minio.Result;
import io.minio.messages.Bucket;
import io.minio.messages.Item;

public interface MinIOClient {

	void createBucket(String bucketName) throws Exception;

	boolean bucketExists(String bucketName) throws Exception;

	List<Bucket> listBuckets() throws Exception;

	void putObject(String bucketName, String objectName, InputStream data, long size) throws Exception;

	InputStream getObject(String bucketName, String objectName) throws Exception;

	void removeObject(String bucketName, String objectName) throws Exception;

	Iterable<Result<Item>> listObjects(String bucketName) throws Exception;
}