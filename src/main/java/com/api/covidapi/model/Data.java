package com.api.covidapi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {
    Date lastChecked;
    List<Covid19Stats> covid19stats = new ArrayList<Covid19Stats>();

    public Date getLastChecked() {
        return lastChecked;
    }

    public void setLastChecked(Date lastChecked) {
        this.lastChecked = lastChecked;
    }

    public List<Covid19Stats> getCovid19stats() {
        return covid19stats;
    }

    public void setCovid19stats(List<Covid19Stats> covid19stats) {
        this.covid19stats = covid19stats;
    }
}
