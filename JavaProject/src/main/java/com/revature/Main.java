package com.revature;

import java.util.Scanner;

import com.revature.Product;
public class Main {
	
   private static final String Customer = null;
public static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
	
		int choice = 0;
		 do {

	   	  System.out.println();
	         System.out.println(" 1.  Add Product to Cart ");
	         System.out.println(" 2.  View Cart Items ") ;
	         System.out.println(" 3.  Delete Cart items ");
	         System.out.println(" 4.  Exit ")  ;
	         System.out.println(" Please Enter Your choice ")  ;

			  choice=scan.nextInt();
	         switch (choice)
	         {case 1:
        	 if(Customer==null) {
	       	  readCustomerDetails();

       	  };
	       	  showProduct() ;
	       	  readProductDetails();
	       	  CreateCartAndAddtoCartList();
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
		 //List<Product> product = ps.getProduct();
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	      System.out.printf("%-8s%-15s%-8s%-12s%-8s","Prodid","ProductName","Price","Catagory","inventoryqty");
	    //ProducDetail[] ProductList = null;
	      System.out.println();
	      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(Product P : ProducDetail.ProductList ) {
System.out.printf("%-8s%-15s%-8s%-12s%-8s",P.getProdID(),P.getProName(),"$"+P.getPrice(),P.getpCatagory(),P.getInventory());
System.out.println();
	    }

	 }
	 
	 public static void  CreateCartAndAddtoCartList(){
          ProducDetail p= new ProducDetail();
          Customer customer = new Customer();
         Cart cart =new Cart(customer.getCustid(),p.getProdID() ,p.getProductPrice() ,p.getInventory());

         Cartutility.addProductToCart(cart);
}



        public static void readProductDetails(){
		System.out.println("Enter Product id");

		String prodid = scan.next();
		System.out.println("Enter Quantity");

		int qty = scan.nextInt();

	}





	    public static void  readCustomerDetails(){

	  Customer	customer =new Customer(); 
		String custid="";
		String customerName="";
		String city=" ";
		System.out.println("Enter Customer id");
		custid= scan.next();

		System.out.println("Enter Customer Customer Name");
		customerName= scan.next();

		System.out.println("Enter Customer City");
		city= scan.next();





    }	





//	    public static  void showProduct() {
//			 //List<Product> product = ps.getProduct();
//		      System.out.printf("%-8s%-15s%-8s%-12s%-8s","Prodid","ProductName","Price","Catagory","inventoryqty");
//		    //ProducDetail[] ProductList = null;
//		      System.out.println();
//		      System.out.println("------------------------------------------------------");
//			for(Product P : ProductDetail.ProductList ) {
//	System.out.printf("%-8s%-15s%-8s%-12s%-8s",P.getProdID(),P.getProdname(),"$"+P.getPrice(),P.getCatagory(),P.getInventoryQty());
//	System.out.println();
//		    }

	   // }
	private static void deleteCartItems() {
		System.out.println("---- Deleting cart items------");

	}
	private static void viewCartItems() {
		System.out.println("---- Viewing cart items-----");
		
		for(Cart c : Cartutility.cartList ) {
			
			int price = ProducDetail.getProductPrice(c.getProdid());
			String Prodname=ProducDetail.getProductName(c.getProdid());
		System.out.println(Prodname+" -" + c.getPrice()+ "-" +c.getQty()+"-"+(c.getQty()*price));
		
			
			}

	}
	private static void addProductTocart() {
		System.out.println("--- Adding Product to cart---");

	}


}
