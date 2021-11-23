package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int uId;
	private String userName;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Doctor> doctors;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<PatientPersonalDetails> patients;
	
	@OneToMany(cascade = CascadeType.ALL)
    List<Finance> finances;
    
	public int getuId() {
		return uId;
	}
	public void setaId(int aId) {
		this.uId = uId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String adminName) {
		this.userName = userName;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
/*	
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	*/
	
	public List<Finance> getFinances() {
		return finances;
	}
	public void setFinances(List<Finance> finances) {
		this.finances = finances;
	}
	
	@Override
	public String toString() {
		return "Admin [aId=" + uId + ", userName=" + userName + ", doctors=" + doctors + "]";
	}
	
	
	
	
	

}
