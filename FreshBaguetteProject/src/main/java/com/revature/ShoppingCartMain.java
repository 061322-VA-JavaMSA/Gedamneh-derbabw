package com.revature;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Product;
import com.revature.models.User;
import com.revature.services.AuthService;
import com.revature.services.CustomerService;
import com.revature.services.ProductService;
import com.revature.services.TaskService;
import com.revature.services.UserService;
import com.revature.util.ConnectionUtil;
public class ShoppingCartMain {


		private static  Logger log = LogManager.getLogger(ShoppingCartMain.class);
		public static Scanner scan =new Scanner(System.in);
		static ProductService ps;
		static CustomerService cs;
		static AuthService as;
		static UserService us;
		static TaskService ts;
		public static Customer customer =null;
		public static String prodid=" ";
		public static int qty=0;
		private static Object Phoneno;
		//private static ProductList[] ProductList;
		public static void main(String[] args) {
			ps =new  ProductService();
			cs =new  CustomerService();
			as = new AuthService();
			us = new UserService();
			String username = null;
			String password = null;
			System.out.println(".........Well Come to FreshBaguete Bakery.............");
			System.out.println("Please enter username:");
			username = scan.nextLine();
			System.out.println("Please enter password:");
			password = scan.nextLine();
			
			log.info(as.login(username, password)); 
			
			try {
				
				Connection c = ConnectionUtil.getHardcodedConnection();
				System.out.println(c.getMetaData().getDriverName());
				java.sql.Statement s = c.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
//			
//			List<Customer> Customer = cs.getCustomers();
//			
//			
//		for(Customer c : Customer) {
//	        System.out.println(c);
//		}	
//		System.out.println(" Inavalid User Name and Please PUt your credential Correctly ");
//		//"1; drop table users"
//		
//			System.out.println("Create New customer account:");
//		System.out.println("Create New customer:");
//			
//			System.out.println("Create New customerid:");
//		int customerid = scan.nextInt();
//			System.out.println("Enter, firstName:");
//		String Firstname = scan.nextLine();
//		System.out.println("Enter, LastName:");
//		String Lastname = scan.nextLine();
//		System.out.println("Enter, Emailid:");
//		String Emailid = scan.nextLine();
//			//System.out.println("Enter, DOB:");
//		String DOB = scan.nextLine();
//		System.out.println("Enter, Password:");
//		String Password = scan.nextLine();
//			System.out.println("Enter, PhoneNo:");
//		String Pnoneno = scan.nextLine();
//			
//			
//		
//		
//		
//			
//		    Customer customerTBC = new Customer();
//		    customerTBC.setCustid(customerid);
//		    customerTBC.setCustomername(Firstname);
//		    customerTBC.setLastname(Lastname);
//			customerTBC.setEmailid(Emailid);
//			customerTBC.setCustomername(DOB);
//			customerTBC.setCustomername(Password);
//	        customerTBC.setPassword(Phoneno);
//		    
//		    
//			
//         log.info (us.createCustomer(customerTBC));
//			
//			
			
			
			
			
		///////////////////////////////////////////////////
			List<User> users = us.getUsers();
			for(User u : users) {
				System.out.println(u);
			}	
			//System.out.println(" Inavalid User Name and Please PUt your credential Correctly ");
			
			
			
			System.out.println("Create, username:");
			String uname = scan.nextLine();
			System.out.println("Create, password:");
			String pass = scan.nextLine();
			User userTBC = new User();
			userTBC.setUsername(uname);
			userTBC.setPassword(pass);
			log.info (us.createUser(userTBC));
			  System.out.println(" Please Enter Your choice ")  ;
			int choice=0 ;
		    do {
		    	
		    	  System.out.println();
		          System.out.println(" 1.  Add Product to Cart ");
		          System.out.println(" 2.  View Cart Items ") ;
		          System.out.println(" 3.  Delete Cart items ");
		          System.out.println(" 4.  Exit ")  ;
		        
		         
				  choice=scan.nextInt();
		          switch (choice)
		          {case 1:
		        	  if(customer==null) {
		        		  readCustomerDetails();
		        		  
		        	  };
		        	  showProduct() ;
		        	  //readProductDetails();
		        	  //addProductTocart();
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
		
		       public static void  CreateCartAndAddtoCartList(){

	           Cart cart =new Cart(customer.getcustid(),prodid ,ProductDetail.getProductPrice(prodid),qty);

	           Cartutility.addProductToCart(cart);
	}

		
		
		
		
		

		    public static void readProductDetails(){
			System.out.println("Enter Product id");

			prodid=scan.next();
			System.out.println("Enter Quantity");

			qty=scan.nextInt();
          
		}

		
		
		
		
		    public static void  readCustomerDetails(){
 
			customer =new Customer(); 
			String custid="";
			String customerName="";
			String city=" ";
			System.out.println("Enter Customer id");
			custid= scan.next();

			System.out.println("Enter  Customer Name");
			customerName= scan.next();

			//System.out.println("Enter Customer City");
			//city= scan.next();





	      }	
		
		
		
		
		
		 public static  void showProduct() {
			 //List<Product> product = ps.getProduct();
		      System.out.printf("%-8s%-15s%-8s%-12s%-8s%-12s","Prodid","ProductName","Price","Catagory","salesqty","inventoryqty");
		    //ProducDetail[] ProductList = null;
		      System.out.println();
		      System.out.println("------------------------------------------------------");
			for(Product P :ProductDetail.ProductList ) {
	System.out.printf("%-8s%-15s%-8s%-12s%-8s%-12s",P.getProdid(),P.getProdname(),"$"+P.getPrice(),P.getCatagory(),P.getsalesqty(),P.getInventoryQty());
	System.out.println();
		    }

		    }
		private static void deleteCartItems() {
			System.out.println("---- Deleting cart items------");
			
		}
		private static void viewCartItems() {
			System.out.println("---- Viewing cart items-----");
			
		  // System.out.printf("%-8s%-15s%-8s%-12s%-8s%-12s","Prodid","ProductName","Price","salesqty");
			 
		}
		private static void addProductTocart() {
			System.out.println("--- Adding Product to cart---");
			
		}
	
			
		}


		



