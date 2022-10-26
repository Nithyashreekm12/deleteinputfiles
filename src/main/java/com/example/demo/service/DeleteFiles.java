package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;

@Service
public class DeleteFiles {

    @Autowired
    BlobServiceClient blbServiceClient;

    @Autowired
    BlobContainerClient blbContainerClient; // client to a container

    public Boolean deleteBlob(String blobName) {

        BlobClient blob = blbContainerClient.getBlobClient(blobName);
        blob.delete();
        return true;
    }
}
