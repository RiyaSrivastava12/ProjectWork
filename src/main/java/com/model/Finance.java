package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Finance {
	
	@Id
	@GeneratedValue
	private int Id;
	@NotBlank(message="Doctor fees is required.")
	private double docFees;
	@NotBlank(message="Registration fees is required.")
	private double regFees;
	@NotBlank(message="Medicine Amount is required.")
	private double medAmount;
	
/*
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="jid",referencedColumnName = "id")
	//@JsonBackReference
	Admin admin;
*/	
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
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	/*
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
*/	
	@Override
	public String toString() {
		return "Finance [bId=" + Id + ", docFees=" + docFees + ", regFees=" + regFees + ", medAmount=" + medAmount
				+ "]";
	}
	
	
	}


