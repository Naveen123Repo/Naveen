package com.javatrainee.registartion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javatrainee.registartion.model.Customer;
import com.javatrainee.registartion.service.CustomerService;

@RestController
@RequestMapping("/cust")
public class CustomerController {

	private CustomerService service;

	@Autowired
	public CustomerController(CustomerService service) {
		super();
		this.service = service;
	}

	/*
	 * @GetMapping("/getById/{id}") public Customer getMessage(@PathVariable int id)
	 * { return service.getCustomer(id); }
	 */

	@GetMapping("/getById")
	public Customer getMessage(@RequestParam("custId") int id) {
		return service.getCustomer(id);
	}

	@PostMapping("/regCust")
	public Customer registerCustomer(@RequestBody Customer cust) {
		return service.registerCust(cust);
	}

	@PutMapping("/updateCust")
	public Customer updateCustomer(@RequestParam("custId") int id, @RequestBody Customer cust) {
		return service.updateCustomer(id, cust);
	}

	@DeleteMapping("/deleteCust")
	public String deleteCustomer(@RequestParam("custId") int id) {
		service.deleteCust(id);
		return "deleted successfully..";
	}

}
