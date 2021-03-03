package com.customerportal.service;

import com.customerportal.dao.Customer;
import com.customerportal.dao.CustomerDao;
import com.customerportal.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		this.customerDao = new CustomerDaoImpl();
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

}
