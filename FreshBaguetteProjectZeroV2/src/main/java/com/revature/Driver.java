package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.dao.ProductPostgres;
import com.revature.dao.UserPostgres;
import com.revature.exceptions.LoginException;
import com.revature.model.Product;
import com.revature.model.User;
import com.revature.services.AuthService;
import com.revature.services.UserService;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		label: while (true) {

			List<Product> cart = new ArrayList<>();
			System.out.println(".........WELL COME TO FRESHBAGUETTE BAKERY........................................");
			System.out.println(".................................................................................");
            System.out.println();
			System.out.println("1: If You have an Account With us Please Login");
			System.out.println("2: If You are a new Customer Please Sign Up");
			String loginMenu = scan.nextLine();
			switch (loginMenu) {
			case "1": {
				System.out.println("Please enter username:");
				String username = scan.nextLine();
				System.out.println("Please enter password:");
				String password = scan.nextLine();
				try {
					User user = new AuthService().login(username, password);
				} catch (LoginException e) {
					// TODO Auto-generated catch block
					System.out.println("User Not Found Please Enter Your Credential Correctly!");
					continue;
				}
				break;
			}

			case "2": {
				System.out.println("Please enter username:");
				String username = scan.nextLine();
				System.out.println("Please enter password:");
				String password = scan.nextLine();

				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				User checkUser = new UserPostgres().get(username);
				if (checkUser == null) {
					new UserService().createUser(user);
					System.out.println("User Created");
					
				} else {

					System.out.println(" User alredy Exists");
					
				}
				continue;
			}

			default: {
				System.out.println("Please Select 1 or 2 ");
				continue;
			}

			}
			while (true) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.printf("%-8s%-15s%-8s", "id", "product_name", "inventory_qty");
						
				// ProducDetail[] ProductList = null;
				System.out.println();
				System.out.println("------------------------------------------------------");
				for (Product p : new ProductPostgres().getAll()) {
					System.out.printf("%-8d%-15s%-8d", p.getProduct_id(), p.getProduct_name(),  p.getInventory_qty());
					
					System.out.println();
				}
				System.out.println();
				System.out.println(" 1.  Add Product to Cart ");
				System.out.println(" 2.  View Cart Items ");
				System.out.println(" 3.  Exit ");
				System.out.println(" Please Enter Your choice ");

				String menu = scan.nextLine();
				switch (menu) {
				case "1": {
					
					
					
					
					
					
					
					

					break;
				}

				case "2": {
					
					break;
				}

				case "3": {
					System.out.println(" Thank you For Shopping With US !");

					System.exit(0);

				}
				default:
					System.out.println("Please Select 1 or 2");
				}
			
			}

		}
	}
}
