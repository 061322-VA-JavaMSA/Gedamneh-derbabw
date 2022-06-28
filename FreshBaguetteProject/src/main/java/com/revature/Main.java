package com.revature;

import com.revature.daos.ProductPostgres;
import com.revature.models.Product;

public class Main {

	public static void main(String[] args) {

		ProductPostgres ps = new ProductPostgres();

		//boolean output = ps.updateProduct(new Product(1, "Eclair", "Pastry", 0, 0, 200));
		// Product p = ps.retrieveproductById(2);
	   Product	output = ps.createProduct(new Product(0, "Madelene", "Sweets", 0, 0, 200));
		//boolean output =ps.deleteProductById(8);
		System.out.println(output);
	}
}