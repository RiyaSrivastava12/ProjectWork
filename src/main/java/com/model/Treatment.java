package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Treatment {
	
	@Id
	@GeneratedValue
	private int tid;
	private String reports;
	private String medicines;
	private String description;
	
	//List<Doctor> doctors;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public String getReports() {
		return reports;
	}
	public void setReports(String reports) {
		this.reports = reports;
	}
	public String getMedicines() {
		return medicines;
	}
	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Treatment [tid=" + tid +  ", reports=" + reports
				+ ", medicines=" + medicines + ", description=" + description + "]";
	}
	
	
	
}
