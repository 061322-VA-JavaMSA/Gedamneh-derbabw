package com.revature;

import java.util.Scanner;
public class Main {
	
   public static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		showProduct() ;
	
		}
	 public static  void showProduct() {
		 //List<Product> product = ps.getProduct();
	      System.out.printf("%-8s%-15s%-8s%-12s%-8s","Prodid","ProductName","Price","Catagory","inventoryqty");
	    //ProducDetail[] ProductList = null;
	      System.out.println();
	      System.out.println("------------------------------------------------------");
		for(Product P : ProducDetail.ProductList ) {
System.out.printf("%-8s%-15s%-8s%-12s%-8s",P.getProdID(),P.getProName(),"$"+P.getPrice(),P.getpCatagory(),P.getInventory());
System.out.println();
	    }

	 }
}
