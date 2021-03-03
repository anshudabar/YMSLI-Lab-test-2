package com.customerportal.dao;

import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String phone ;
	private Date dob;
	
	
	public Customer() {}
	
	
	public Customer(int id, String name, String address, String phone, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}


	public Customer(String name, String address, String phone, Date dob) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=").append(id).append(", name=").append(name).append(", address=").append(address)
				.append(", phone=").append(phone).append(", dob=").append(dob).append("]");
		return builder.toString();
	}

	
	
}
