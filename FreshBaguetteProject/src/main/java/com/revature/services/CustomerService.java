package com.revature.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;

import com.revature.Customer;
import com.revature.daos.CustomerDAO;
//import com.revature.daos.UserDAO;
//import com.revature.daos.UserPostgres;
//import com.revature.models.User;
import com.revature.daos.CustomerPostgres;
import com.revature.daos.UserDAO;
import com.revature.daos.UserPostgres;
import com.revature.models.User;

public class CustomerService {

	

	private CustomerDAO cd = new CustomerPostgres();
	private static Logger log = LogManager.getLogger(CustomerService.class);
	
	public List<Customer> getCustomers(){
		return cd.retrieveCustomers();
	}
	
	public  Customer createCustomer(Customer c) {
		// logic to validate u
		// if ok
	//c = cd.createCustomer(c);
		Customer customer = cd.createCustomer(c);
		log.info("User: " + customer + " was created.");
		return customer;
	}
}


