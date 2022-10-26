package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

@Configuration
public class AzureBlobConfig {

   @Value("${spring.azure.blob.store.connectionString}")
   String connectionString;

   @Value("${spring.azure.blob.store.containerName}")
   String containerName;

   @Bean("blbServiceClient")
   public BlobServiceClient blobServiceClient() {
      BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectionString)
            .buildClient();
      return blobServiceClient;
   }

   @Bean("blbContainerClient")
   public BlobContainerClient blobContainerClient() {

      BlobContainerClient blobContainerClient = blobServiceClient().getBlobContainerClient(containerName);
      return blobContainerClient;

   }
}
