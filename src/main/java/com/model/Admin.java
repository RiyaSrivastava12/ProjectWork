package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	
	@javax.persistence.Id
	@GeneratedValue
	private int Id;
	private String aname;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Finance> finances;
/*	
	@OneToMany
	List<Doctor> doctors;
*/	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	
	public List<Finance> getFinances() {
		return finances;
	}
	public void setFinances(List<Finance> finances) {
		this.finances = finances;
	}
	
/*	
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	*/
	@Override
	public String toString() {
		return "Admin [Id=" + Id + ", aname=" + aname + "]";
	}
	

}
