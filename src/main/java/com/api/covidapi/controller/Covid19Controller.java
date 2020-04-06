package com.api.covidapi.controller;

import com.api.covidapi.model.Covid19Stats;
import com.api.covidapi.model.Regional;
import com.api.covidapi.service.Covid19Service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Covid19Controller {

    @Autowired
    Covid19Service covid19Service;

    @RequestMapping("/stats/India")
    public Covid19Stats getLatestStats() throws IOException{
        return covid19Service.getLatestIndianStats();
    }
    
    @RequestMapping("/stats/India/getStateData/{state}")
    public Regional getLatestStatsofState(@PathVariable String state) throws IOException{
        return covid19Service.getLatestIndianStatsofState(state);
    }
    
    @RequestMapping("/stats/India/process")
    public void processData() throws IOException{
    	System.out.println("Porcessing Data");
    	covid19Service.saveStats();        
    }
}
