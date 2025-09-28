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
package org.civitas.minio.impl;

import java.io.InputStream;
import java.util.List;

import org.civitas.minio.MinIOClient;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.minio.BucketExistsArgs;
import io.minio.GetObjectArgs;
import io.minio.ListBucketsArgs;
import io.minio.ListObjectsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.RemoveObjectArgs;
import io.minio.Result;
import io.minio.messages.Bucket;
import io.minio.messages.Item;

@Component(name = "MinIOClient", configurationPid = "MinIOClientConfig", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = MinIOClientImpl.Config.class)
@RequireConfigurationAdmin
public class MinIOClientImpl implements MinIOClient {

    @ObjectClassDefinition(name = "MinIO Client Configuration")
    public @interface Config {

	@AttributeDefinition(name = "Endpoint", description = "MinIO server endpoint")
	String endpoint() default "http://localhost:9000";

	@AttributeDefinition(name = "Access Key", description = "MinIO access key")
	String accessKey() default "admin";

	@AttributeDefinition(name = "Secret Key", description = "MinIO secret key")
	String secretKey() default "password123";
    }

    private MinioClient minioClient;
    private Logger logger = LoggerFactory.getLogger(MinIOClientImpl.class);

    @Activate
    void activate(Config config) {

	this.minioClient = MinioClient.builder().endpoint(config.endpoint())
		.credentials(config.accessKey(), config.secretKey()).build();

	logger.info("MinIO client activated with endpoint: {}", config.endpoint());
    }

    @Deactivate
    void deactivate() {
	logger.info("MinIO client deactivated");
    }

    @Override
    public void createBucket(String bucketName) throws Exception {
	minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
	logger.info("Created bucket: {}", bucketName);
    }

    @Override
    public boolean bucketExists(String bucketName) throws Exception {
	return minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
    }

    @Override
    public List<Bucket> listBuckets() throws Exception {
	return minioClient.listBuckets(ListBucketsArgs.builder().build());
    }

    @Override
    public void putObject(String bucketName, String objectName, InputStream data, long size) throws Exception {
	minioClient.putObject(
		PutObjectArgs.builder().bucket(bucketName).object(objectName).stream(data, size, -1).build());
	logger.info("Put object: {}/{}", bucketName, objectName);
    }

    @Override
    public InputStream getObject(String bucketName, String objectName) throws Exception {
	return minioClient.getObject(GetObjectArgs.builder().bucket(bucketName).object(objectName).build());
    }

    @Override
    public void removeObject(String bucketName, String objectName) throws Exception {
	minioClient.removeObject(RemoveObjectArgs.builder().bucket(bucketName).object(objectName).build());
	logger.info("Removed object: {}/{}", bucketName, objectName);
    }

    @Override
    public Iterable<Result<Item>> listObjects(String bucketName) throws Exception {
	return minioClient.listObjects(ListObjectsArgs.builder().bucket(bucketName).build());
    }
}