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
     // = "DefaultEndpointsProtocol=https;AccountName=nptstorageaccountjava;AccountKey=2U+PulxRRiy8Cj/c4V8mLYIlwys684e4uWCK0SPhuwaMKN9wQtOWpYMdMpi1oQoYBoIQmr0yhy2waNB3ijtuZg==;EndpointSuffix=core.windows.net";

     @Value("${spring.azure.blob.store.containerName}")
    String containerName ;


   @Bean("blbServiceClient")
   public BlobServiceClient blobServiceClient()
   {
    BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectionString).buildClient();
    return blobServiceClient;
   }

   @Bean("blbContainerClient")
   public BlobContainerClient blobContainerClient() {
      
      BlobContainerClient blobContainerClient =  blobServiceClient().getBlobContainerClient(containerName);
      return blobContainerClient;

   }
}
 
