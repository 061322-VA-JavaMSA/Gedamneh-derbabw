package com.revature;

import java.util.Scanner;

public class Main {
  public static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		showProduct() ;
		
		
		
		///////////////////////////////////
		
		System.out.println("\nWelcome to FreshBaguette! Please select YourChoice:\n" + "1) Baguette\n"
                + "2) Eclair\n"
                + "3) ChecolateCrossants\n"
                + "4) Parsian\n"
                + "5) Coke\n"
                + "6) Madelene\n"
                + "7) Quiche\n"
                + "and any other number for nothing!");
  int choice;
  choice = sc.nextInt();
   switch (choice) {
     case 1:
         System.out.println( "Here is your Baguette!");
         break;
     case 2:
         System.out.println("Here is your Eclair!");
         break;
     case 3:
         System.out.println( "Here is your ChecolateCrossants!");
         break;
     case 4:
         System.out.println( "Here is your Parsian!");
         break;
     case 5:
         System.out.println( "Here is your Coke");
         break;
     case 6:
         System.out.println( "Here is your Madelene");
         break;
     case 7:
         System.out.println( "Here is your Quiche");
         break;
     
     default:
         System.out.println("You want nothing?!");
         break;
 }
      int option;
      Scanner sd = new Scanner(System.in);
    System.out.println("\nPlease select a drink:\n"
             + "1) iced tea\n"
                + "2) soda\n"
                + "3) lemonade\n"
                + "and any other number for nothing!" );
     option =  sd.nextInt();
 switch (option) {
     case 1:
         System.out.println( "Here is your iced tea!");
         break;
     case 2:
         System.out.println("Here is your soda!");
         break;
     case 3:
         System.out.println("Here is your lemonade!");
         break;
     default:
         System.out.println("You want nothing?!");
         break;
		
         
 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		////////////////////////////////////////////////

	}
	
	public static void showProduct() {
		
		for(Product P :ProducDetail.ProductList) {
			
			System.out.println(P.getProdID()+"--"+P.getProName()+"--"+P.getPrice()+"--"+P.getpCatagory()+"--"+P.getInventory());
		}
		
	}

}
