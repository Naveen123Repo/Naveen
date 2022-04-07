package com.javatrainee.registartion.service;

import org.springframework.stereotype.Service;

import com.javatrainee.registartion.model.Customer;

@Service
public class CustomerService {

	Customer cust;

	public Customer getCustomer(int id) {
		Customer cust = new Customer();
		cust.setName("java");
		cust.setId(1001);
		cust.setMobileNumber(99999999999l);
		cust.setAmount(2000.00);
		return cust;
	}

	public Customer registerCust(Customer cust) {
		cust.setMobileNumber(9876876899l);
		this.cust = cust;
		return cust;
	}

	public Customer updateCustomer(int id, Customer cust2) {
		System.out.println(cust);
		cust.setAmount(cust2.getAmount());
		cust.setMobileNumber(cust2.getMobileNumber());
		return cust;
	}

	public void deleteCust(int id) {
		cust = null;
	}

}
