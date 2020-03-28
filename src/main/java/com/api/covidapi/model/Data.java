package com.api.covidapi.model;

import java.util.ArrayList;
import java.util.List;

public class Data {
    Summary summary;
    List<Regional> regional = new ArrayList<Regional>();
    
	public Summary getSummary() {
		return summary;
	}
	public void setSummary(Summary summary) {
		this.summary = summary;
	}
	public List<Regional> getRegional() {
		return regional;
	}
	public void setRegional(List<Regional> regional) {
		this.regional = regional;
	}

}
