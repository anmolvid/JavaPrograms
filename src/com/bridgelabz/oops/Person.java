package com.bridgelabz.oops;

public class Person {
	private String firstname;
	private String lastname;

	private long contactno;
	private Address address = new Address();

	public Person() {
		firstname = null;
		lastname = null;
		address = null;
		contactno = 0;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	
}
