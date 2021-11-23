package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PatientHistory {
	
	@Id
	@GeneratedValue
	private int phId;
	private String disease;
	private String dAdvice;
	private String diet;
	private String treatment;
	
	
	public int getphId() {
		return phId;
	}
	public void setphId(int phId) {
		this.phId=phId;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getdAdvice() {
		return dAdvice;
	}
	public void setdAdvice(String dAdvice) {
		this.dAdvice = dAdvice;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	@Override
	public String toString() {
		return "PatientHistory [disease=" + disease + ", dAdvice=" + dAdvice + ", diet=" + diet + ", treatment="
				+ treatment + "]";
	}
	
	

}
