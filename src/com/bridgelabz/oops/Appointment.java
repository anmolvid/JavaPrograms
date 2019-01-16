package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.List;

public class Appointment {
	private String doc_name;
	
	List<Patient> listOfPatients = new ArrayList<Patient>();

	public String getDoc_name() {
		return doc_name;
	}

	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}

	public List<Patient> getListOfPatients() {
		return listOfPatients;
	}

	public void setListOfPatients(List<Patient> listOfPatients) {
		this.listOfPatients = listOfPatients;
	}

	

}
