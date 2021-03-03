package com.customerportal.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.customerportal.dao.Customer;
import com.customerportal.service.CustomerService;
import com.customerportal.service.CustomerServiceImpl;

public class CutomerAppTester {
	public static void main(String[] args) {
		CustomerService custService = new CustomerServiceImpl();
		 
	    Date date1 = new Date();

		Customer customer1 = new Customer("Anshuman", "FBD", "987654321",date1);
		Customer customer2 = new Customer("Sahil", "DEL", "123456789",date1);
		Customer customer3 = new Customer("Gitesh", "GGN", "5679235692",date1);
		Customer customer4 = new Customer("Aakash", "MUM", "225588994",date1);

		custService.addCustomer(customer1);
		custService.addCustomer(customer2);
		custService.addCustomer(customer3);
		custService.addCustomer(customer4);

		System.out.println("Customers by IDs : ");
        System.out.println(custService.getCustomerById(2));
		System.out.println(custService.getCustomerById(3));
		System.out.println(custService.getCustomerById(4));

	}
}
