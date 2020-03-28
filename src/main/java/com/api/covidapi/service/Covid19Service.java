package com.api.covidapi.service;

import com.api.covidapi.model.Covid19Stats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Covid19Service {
	
	@Autowired
	@Value("${app.covid.india.resturl.latest}")
	private String restURL;
	
	public Covid19Stats getLatestIndianStats()
	{
		Covid19Stats stats = new Covid19Stats();
		RestTemplate restTemplate = new RestTemplate();
		stats = restTemplate.getForObject(restURL, Covid19Stats.class);
		return stats;
	}
	

   }
