package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class PatientPersonalDetails {

	// fields
	@Id
	@GeneratedValue
	private int pId;
	private String pName;
	private int pAge;
	private long phoneNo;
	private String gender;
	private String address;
	private String symptoms;

	
    //Getters & Setters
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms= symptoms;
	}

	@Override
	public String toString() {
		return "PatientPersonalDetails [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge + ", phoneNo=" + phoneNo
				+ ", gender=" + gender + ", address=" + address + ", symptoms=" + symptoms + "]";
	}


	
	

}