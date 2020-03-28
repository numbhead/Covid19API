package com.api.covidapi.controller;

import com.api.covidapi.model.Covid19Stats;
import com.api.covidapi.service.Covid19Service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Covid19Controller {

    @Autowired
    Covid19Service covid19Service;

    @RequestMapping("/stats/India/latest")
    public Covid19Stats convertAmount() throws IOException{
        return covid19Service.getLatestIndianStats();
    }
}
