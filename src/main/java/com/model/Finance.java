package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Finance {
	
	@Id
	@GeneratedValue
	private int bId;
	private double docFees;
	private double regFees;
	private double medAmount;
	
	public double getDocFees() {
		return docFees;
	}
	public void setDocFees(double docFees) {
		this.docFees = docFees;
	}
	public double getRegFees() {
		return regFees;
	}
	public void setRegFees(double regFees) {
		this.regFees = regFees;
	}
	public double getMedAmount() {
		return medAmount;
	}
	public void setMedAmount(double medAmount) {
		this.medAmount = medAmount;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	@Override
	public String toString() {
		return "Finance [bId=" + bId + ", docFees=" + docFees + ", regFees=" + regFees + ", medAmount=" + medAmount
				+ "]";
	}
	
	}


