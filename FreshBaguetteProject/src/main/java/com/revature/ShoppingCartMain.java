package com.revature;
import java.util.Scanner;
public class ShoppingCartMain {


		public static Scanner sc =new Scanner(System.in);
		public static Customer customer =null;
		public static String prodid=" ";
		public static int qty=0;
		private static ProducDetail[] ProductList;
		public static void main(String[] args) {
			int choice=0;
		    do {
		    	
		    	  System.out.println();
		          System.out.println(" 1.  Add Product to Cart ");
		          System.out.println(" 2.  View Cart Items ") ;
		          System.out.println(" 3.  Delete Cart items ");
		          System.out.println(" 4.  Exit ")  ;
		          System.out.println(" Please Enter Your choice ")  ;
		         
				  choice=sc.nextInt();
		          switch (choice)
		          {case 1:
		        	  if(customer==null) {
		        		  readCustomerDetails();
		        		  
		        	  };
		        	  showProduct() ;
		        	  readProductDetails();
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
		
		      public static void  CreateCartAndAddtoCartList(){

	           Cart cart =new Cart(customer.getcustid(),prodid ,ProducDetail.getProductPrice(prodid) ,qty);

	           Cartutility.addProductToCart(cart);
	}

		
		
		
		
		

		    public static void readProductDetails(){
			System.out.println("Enter Product id");

			prodid=sc.next();
			System.out.println("Enter Quantity");

			qty=sc.nextInt();

		}

		
		
		
		
		    public static void  readCustomerDetails(){
 
			customer =new Customer(); 
			String custid="";
			String customerName="";
			String city=" ";
			System.out.println("Enter Customer id");
			custid= sc.next();

			System.out.println("Enter Customer Customer Name");
			customerName= sc.next();

			System.out.println("Enter Customer City");
			city= sc.next();





	      }	
		
		
		
		
		
		 public static  void showProduct() {
		      System.out.printf("%-8s%-15s%-8s%-12s%-8s","Prodid","ProductName","Price","Catagory","inventory");
		    //ProducDetail[] ProductList = null;
		      System.out.println();
		      System.out.println("------------------------------------------------------");
			for(Product P : ProducDetail.ProductList) {
	System.out.printf("%-8s%-15s%-8s%-12s%-8d",P.getProdID(),P.getProdname(),"$"+P.getPrice(),P.getpCatagory(),P.getQty());
	System.out.println();
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


		



