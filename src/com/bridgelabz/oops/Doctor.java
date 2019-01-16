package com.bridgelabz.oops;

public class Doctor {
	private int id;
	private String Dname;
	private String specialization;
	private String availability;
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}


	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}

	
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	
	
}
