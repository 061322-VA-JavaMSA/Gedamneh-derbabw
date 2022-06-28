package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Product;

public class ProducDetail {
	
	
	public static List<Product> ProductList= new ArrayList<>();
	static {
		ProductList.add(new Product("B101 ", " Baguette ", "Bread  ", 4 , 200));
		ProductList.add(new Product("P101 ", " Eclair ", "Pastries ", 5 , 300));
		ProductList.add(new Product("CC101 ", " CCrossants ", "Crossant  ", 4 , 200));
		ProductList.add(new Product("S101 ", " Parsian ", "Sandwitchs  ", 4 , 200));
		ProductList.add(new Product("C101 ", " Coke ", "Beverage  ", 2 , 100));
		ProductList.add(new Product("M101 ", " Madelene ", "Sweets  ", 2 , 40));
		ProductList.add(new Product("Q101 ", " Quiche ", "Savory  ", 7 , 50));
		
		
	}
	
	
	public static String getProductName(String prodID) {
		
		String proName=" ";
		for(Product p: ProductList) {
			
			if(p.getProdID().equals(prodID)) {
				proName=p.getProName();
				break;
			}
		}
		return proName;
	}
	
   public static int getProductPrice(Object prodid) {
	   
	   
	   int  proPrice=0;
		for(Product p: ProductList) {
			
			if(p.getProdID().equals(prodid)) {
				proPrice=p.getPrice();
				break;
			}
		}
		return proPrice;
		
	}
   public static Product findProduct(String prodid) {
		  
		  Product temp=null;
		  for(Product p : ProductList) {
		  
			if(p.getProdID().equals(prodid)) {
		  temp=p;
		  break;
		   }
	  }
		  return temp;
	  }


public int getProdID() {
	// TODO Auto-generated method stub
	return 0;
}

public int getProductPrice() {
	// TODO Auto-generated method stub
	return 0;
}

public int getpCatagory() {
	// TODO Auto-generated method stub
	return 0;
}

public int getInventory() {
	// TODO Auto-generated method stub
	return 0;
}




}
