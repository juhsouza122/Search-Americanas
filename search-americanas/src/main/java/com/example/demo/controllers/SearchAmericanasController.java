package com.example.demo.controllers;

import com.example.demo.business.ServiceResult;
import com.example.demo.services.SearchAmericanasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/api/americanas")
public class SearchAmericanasController extends HelperController {
    @Autowired
    SearchAmericanasService service;

    @GetMapping(value = "/getWebCam")
    public String getWebCam () throws IOException {
        ServiceResult<String> webCam = service.getWebCam();
        
        return webCam.getData();
    }
}
