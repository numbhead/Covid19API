package com.api.covidapi.model;

import java.util.Date;

public class Covid19Stats {
	boolean success;
	Data data;
	Date lastRefreshed;
	Date lastOriginUpdate;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
	public Date getLastRefreshed() {
		return lastRefreshed;
	}
	public void setLastRefreshed(Date lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}
	public Date getLastOriginUpdate() {
		return lastOriginUpdate;
	}
	public void setLastOriginUpdate(Date lastOriginUpdate) {
		this.lastOriginUpdate = lastOriginUpdate;
	}
	
	
    }
