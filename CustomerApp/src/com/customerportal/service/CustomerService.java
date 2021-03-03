package com.customerportal.service;

import com.customerportal.dao.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public Customer getCustomerById(int id);
}
