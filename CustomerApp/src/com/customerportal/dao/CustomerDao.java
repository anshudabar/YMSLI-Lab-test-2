package com.customerportal.dao;

public interface CustomerDao {
	public void addCustomer(Customer customer);
	public Customer getCustomerById(int id);
}
