package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Doctor {

	@Id
	@GeneratedValue
	private int Id;
	
	@NotBlank(message="Name is required.")
	private String dname;
	@NotBlank(message="specialization is required.")
	private String specialization;
	private String qualification;
	private String availability;
	
	
/*	@ManyToOne
	@JoinColumn(name="id")
	Admin admin1;
	
	
    public Admin getAdmin1() {
		return admin1;
	}
	public void setAdmin1(Admin admin1) {
		this.admin1 = admin1;
	}
*/	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Doctor [dId=" + Id + ", dname=" + dname + ", specialization=" + specialization + ", qualification="
				+ qualification + ", availability=" + availability + "]";
	}
	
	
	
}
