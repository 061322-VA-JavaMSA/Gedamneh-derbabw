package com.revature;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
//public static final Product[] ProductList = null;
public static List<Product> ProductList= new ArrayList<>();

	
	static {
		ProductList.add(new Product("B101 ", " Baguette ", "OrganicBread  ", 4 , 200));
		ProductList.add(new Product("B101 ", " Eclair ", "Pastries ", 5 , 300));
		ProductList.add(new Product("B101 ", " ChecolateCrossants ", "Crossant  ", 4 , 200));
		ProductList.add(new Product("B101 ", " Parsian ", "Sandwitchs  ", 4 , 200));
		ProductList.add(new Product("B101 ", " Coke ", "Beverage  ", 2 , 100));
		ProductList.add(new Product("B101 ", " Madelene ", "Sweets  ", 2 , 40));
		ProductList.add(new Product("B101 ", " Quiche ", "Savory  ", 7 , 50));
		
		
	}
	
}
