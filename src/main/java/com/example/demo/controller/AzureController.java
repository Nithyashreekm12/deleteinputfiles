package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.service.DeleteFiles;

@RestController
@RequestMapping("/files")
public class AzureController {
  
    @Autowired
    public DeleteFiles azureblob;
    
    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam String fileName) {

            azureblob.deleteBlob(fileName);
      return ResponseEntity.ok().build();
   }

    
}
