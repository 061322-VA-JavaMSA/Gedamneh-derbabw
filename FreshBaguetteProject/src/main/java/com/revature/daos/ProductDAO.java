package com.revature.daos;

import java.util.List;

import com.revature.models.Product;

public interface ProductDAO {

	List<Product> retrieveProducts();
}
