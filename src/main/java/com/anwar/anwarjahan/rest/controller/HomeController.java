package com.anwar.anwarjahan.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.anwar.anwarjahan.model.Customer;
import com.anwar.anwarjahan.repository.CustomerRepository;

@RestController
public class HomeController {

	@Autowired
	private CustomerRepository customerRepository;

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	@ResponseBody
	public String hello() {

		return "Hello World";
	}

	@RequestMapping(value = "/add")
	public @ResponseBody String addCustomer(@RequestParam String fname, @RequestParam String lname) {
		// This returns a JSON or XML with the users
		Customer c = new Customer(fname, lname);

		customerRepository.save(c);
		return "Save";
	}

	@RequestMapping(value = "/all")
	public @ResponseBody Iterable<Customer> getAllUsers() {
		// This returns a JSON or XML with the users
		return customerRepository.findAll();
	}

}
