package com.revature.dao;

import java.util.List;

import com.revature.model.Product;

public interface ProductDAO {
	Product get(int product_id);

	List<Product> getAll();

	Product createProduct(Product product);

	boolean updateProduct(Product product);

	boolean deleteProduct(int product_id);
}
