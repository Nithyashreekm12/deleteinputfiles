package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// String connectStr = "DefaultEndpointsProtocol=https;AccountName=nptstorageaccountjava;AccountKey=2U+PulxRRiy8Cj/c4V8mLYIlwys684e4uWCK0SPhuwaMKN9wQtOWpYMdMpi1oQoYBoIQmr0yhy2waNB3ijtuZg==;EndpointSuffix=core.windows.net";
       
		SpringApplication.run(DemoApplication.class, args);
		    
// BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();

// BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient("input");
// System.out.println("Listing files in container:");
// for (BlobItem blobItem : containerClient.listBlobs()) {
//     System.out.println("\t" + blobItem.getName());
// }
	}

}
