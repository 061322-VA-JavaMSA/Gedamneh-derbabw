package com.revature.daos;

import java.util.List;

import com.revature.Customer;
import com.revature.daos.CustomerDAO;
import com.revature.models.User;

public class CustomerPostgres implements CustomerDAO {

	@Override
	public List<Customer> retrieveCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createCustomer(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer createCustomer(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer retrieveCustomerById(int custid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer retriveCustomerbyLName(String Lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCusomer(Customer c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomerById(int custid) {
		// TODO Auto-generated method stub
		return false;
	}

}