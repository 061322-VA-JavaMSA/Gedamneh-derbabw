package com.revature.daos;

import java.util.List;

import com.revature.Customer;
import com.revature.models.Product;
import com.revature.models.User;

public interface CustomerDAO {
   
    Customer createCustomer(Customer c);
	Customer retrieveCustomerById(int custid);
	List<Customer> retrieveCustomers();
    Customer retriveCustomerbyLName(String Lastname  );
    boolean updateCusomer(Customer c);
	boolean deleteCustomerById(int custid);
	User createCustomer(User u);
	List<Product> retrieveProducts();

	

}


