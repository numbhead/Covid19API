package com.api.covidapi.service;

import com.api.covidapi.model.Covid19Stats;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.api.covidapi.model.Regional;
import com.api.covidapi.model.Statistics;
import com.api.covidapi.repository.StatisticRepository;

@Service
public class Covid19Service {
	
	@Autowired
	@Value("${app.covid.india.resturl.latest}")
	private String restURL;
	
	@Autowired
	private StatisticRepository statRepo;
	
	public Covid19Stats getLatestIndianStats()
	{
		Covid19Stats stats = new Covid19Stats();
		RestTemplate restTemplate = new RestTemplate();
		stats = restTemplate.getForObject(restURL, Covid19Stats.class);
		return stats;
	}

	public Regional getLatestIndianStatsofState(String state) {
		Covid19Stats stats = new Covid19Stats();
		List<Regional> stateList = new ArrayList<Regional>();
		Regional reg = new Regional();
		RestTemplate restTemplate = new RestTemplate();
		stats = restTemplate.getForObject(restURL, Covid19Stats.class);
		stateList = stats.getData().getRegional();
			for(Regional r : stateList)
			{
				if(r.getLoc().equalsIgnoreCase(state))
					reg=r;
			}
		return reg;
	}
	

	public void saveStats()
	{
		Covid19Stats cStat = new Covid19Stats();
		cStat = getLatestIndianStats();
		List<Regional> regions = new ArrayList<Regional>();
		regions = cStat.getData().getRegional();
		
		for(Regional reg : regions){
			System.out.println("Region is "+reg.getLoc());
			Statistics stat = new Statistics();
			stat.setArea(reg.getLoc());
			stat.setConfirmedCasesForeign(reg.getConfirmedCasesForeign());
			stat.setConfirmedCasesIndian(reg.getConfirmedCasesIndian());
			stat.setDeaths(reg.getDeaths());
			stat.setRecordCreatedDate(new Date());
			statRepo.save(stat);
		}
		
	}
   }
