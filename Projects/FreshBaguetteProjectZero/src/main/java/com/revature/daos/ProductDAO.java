package com.revature.daos;

import java.util.List;

import com.revature.models.Product;

public interface ProductDAO {

	List<Product> retrieveProducts();

	Product createProduct(Product p);

	Product retrieveproductById(int id);

	//List<Product> retrieveProduct();

	boolean deleteProductById(int id);

	
}
