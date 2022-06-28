package com.revature.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;

import com.revature.Customer;
import com.revature.daos.ProductDAO;
import com.revature.daos.ProductPostgres;
import com.revature.daos.UserDAO;
import com.revature.daos.UserPostgres;
import com.revature.models.Product;
import com.revature.models.User;

public class ProductService {

	private ProductDAO pd = new ProductPostgres();
	private static Logger log = LogManager.getLogger(Product.class);
//	
//	public String login(int prodid,String prodname, String catagory,int price, int qty) {
//		
//	}

	public List<Product> getProduct() {
	
	return pd.retrieveProducts();
	
		
	}

		
		
		public Product createProduct(Product p) {
			// logic to validate ussss
			// if ok
		//u = ud.createUser(u);
			Product product = pd.createProduct(p);
			log.info("User: " + product + " was created.");
			return product;
		}

		public Message createCustomer(Customer customerTBC) {
			// TODO Auto-generated method stub
			return null;
		}
	
		
		
		
		
		
	
}




