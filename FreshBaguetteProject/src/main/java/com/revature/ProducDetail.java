package com.revature;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
public class ProducDetail {

public static List<Product>  ProductList= new ArrayList<>();

	
	static {
		ProductList.add(new Product("B101 ", " Baguette ", "Bread  ", 4 , 200));
		ProductList.add(new Product("E101 ", " Eclair ", "Pastry ", 5 , 300));
		ProductList.add(new Product("C101 ", " Kouignamann ", "Croissant  ", 4 , 200));
		ProductList.add(new Product("P101 ", " Parsian ", "Sandwitchs  ", 4 , 200));
		ProductList.add(new Product("C101 ", " Coke ", "Beverage  ", 2 , 100));
		ProductList.add(new Product("M101 ", " Madelene ", "Sweet  ", 2 , 40));
		ProductList.add(new Product("Q101 ", " Quiche ", "Savory  ", 7 , 50));
		
		
	}
	
	
	public static String getProductName(String prodID) {
		
		String proName=" ";
		for(Product p: ProductList) {
			
			if(p.getProdid().equals(prodID)) {
				proName=p.getProdname();
				break;
			}
		}
		return proName;
	}
	
   public static int getProductPrice(String prodID) {
	   
	   
	   int  proPrice=0;
		for(Product p: ProductList) {
			
			if(p.getProdid().equals(prodID)) {
				proPrice=(int) p.getPrice();
				break;
			}
		}
		return proPrice;
		
	}
  public static Product findProduct(String prodid) {
	  
	  Product temp=null;
	  for(Product p : ProductList) {
	  
		if(p.getProdid().equals(prodid)) {
	  temp=p;
	  break;
	   }
  }
	  return temp;
  }
public String getProdID() {
	// TODO Auto-generated method stub
	return null;
}

public String getProductPrice() {
	// TODO Auto-generated method stub
	return null;
}

public String getpCatagory() {
	// TODO Auto-generated method stub
	return null;
}

public String getInventory() {
	// TODO Auto-generated method stub
	return null;
}


	
}
