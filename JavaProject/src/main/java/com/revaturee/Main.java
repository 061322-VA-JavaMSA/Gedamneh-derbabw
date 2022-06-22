package com.revaturee;

import java.util.Scanner;

import com.revature.ProducDetail;
import com.revature.Product;

public class Main {
	public static Scanner sc =new Scanner(System.in);
	private static ProducDetail[] ProductList;
	public static void main(String[] args) {
		int choice=0;
	    do {
	    	  showProduct() ;
	    	  System.out.println();
	          System.out.println(" 1.  Add Product to Cart ");
	          System.out.println(" 2.  View Cart Items ") ;
	          System.out.println(" 3.  Delete Cart items ");
	          System.out.println(" 4.  Exit ")  ;
	          System.out.println(" Please Enter Your choice ")  ;
	          //Scanner sc;
			// Scanner sc = null;
			  choice=sc.nextInt();
	          switch (choice)
	          {case 1:
	          addProductTocart();
	          break;

              case 2:
              viewCartItems();
              break; 
              
              case 3:
            	  deleteCartItems();
            	  break;
	          
              default:
            	  System.out.println("Thank you for shopping!");

            	  }
	          


	             }while(choice<4);
		}
	
	
	 public static  void showProduct() {
	      //System.out.printf("Prodid","Price","Catagory","inventory");
	    //ProducDetail[] ProductList = null;
		for(Product  P : ProducDetail.ProductList ) {

	     System.out.println("--"+P.getProdID()+"--"+P.getProductPrice()+"--"+P.getpCatagory()+"--"+P.getInventory());
	    }

	    }
	private static void deleteCartItems() {
		System.out.println("---- Deleting cart items------");
		
	}
	private static void viewCartItems() {
		System.out.println("---- Viewing cart items-----");

		
	}
	private static void addProductTocart() {
		System.out.println("--- Adding Product to cart---");
		
	}
	
		
	}


	


