package com.api.covidapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class Statistics {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_generator")
	@SequenceGenerator(name="seq_generator", sequenceName = "seq_gen")
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String area;
	
	private long confirmedCasesIndian;
		
	private long confirmedCasesForeign;
	
	private long discharged;
	
	private long deaths;
	
	@Column(nullable=false)
	private Date recordCreatedDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getConfirmedCasesIndian() {
		return confirmedCasesIndian;
	}
	public void setConfirmedCasesIndian(long confirmedCasesIndian) {
		this.confirmedCasesIndian = confirmedCasesIndian;
	}
	public long getConfirmedCasesForeign() {
		return confirmedCasesForeign;
	}
	public void setConfirmedCasesForeign(long confirmedCasesForeign) {
		this.confirmedCasesForeign = confirmedCasesForeign;
	}
	public long getDischarged() {
		return discharged;
	}
	public void setDischarged(long discharged) {
		this.discharged = discharged;
	}
	public long getDeaths() {
		return deaths;
	}
	public void setDeaths(long deaths) {
		this.deaths = deaths;
	}
	public Date getRecordCreatedDate() {
		return recordCreatedDate;
	}
	public void setRecordCreatedDate(Date recordCreatedDate) {
		this.recordCreatedDate = recordCreatedDate;
	}
	
	

}

