package com.revature.services;

import java.util.List;

import com.revature.daos.ProductDAO;
import com.revature.daos.ProductPostgres;
import com.revature.models.Product;

public class ProductService {

	private ProductDAO pd = new ProductPostgres();
//	
//	public String login(int prodid,String prodname, String catagory,int price, int qty) {
//		
//	}

	public List<Product> getProduct() {
	
		return pd.retrieveProducts();
	
	
}
}



