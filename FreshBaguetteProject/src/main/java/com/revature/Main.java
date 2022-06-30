package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.daos.ProductPostgres;
import com.revature.daos.UserPostgres;
import com.revature.exceptions.LoginException;
import com.revature.models.Product;
import com.revature.models.User;
import com.revature.services.AuthService;
import com.revature.services.UserService;

public class Main {

	public static void main(String[] args) {

		// ProductPostgres ps = new ProductPostgres();

		// boolean output = ps.updateProduct(new Product(1, "Eclair", "Pastry", 0, 0,
		// 200));
		// Product p = ps.retrieveproductById(2);
		// Product output = ps.createProduct(new Product(0, "Madelene", "Sweets", 0, 0,
		// 200));
		// boolean output =ps.deleteProductById(8);
		// System.out.println(output);
		Scanner scan = new Scanner(System.in);
		label: while (true) {

			List<Product> cart = new ArrayList<>();
			System.out.println(".........Well Come to FreshBaguete Bakery.............");

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
					System.out.println("User Not Found!");
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
				User checkUser = new UserPostgres().retrieveUserByUsername(username);
				if (checkUser == null) {
					new UserService().createUser(user);
				} else {

					System.out.println(" User alredy Exists");
				}
				break;
			}

			default: {
				System.out.println("Please Select 1 or 2 ");
				continue;
			}

			}
			while (true) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.printf("%-8s%-15s%-8s%-12s%-8s", "Prodid", "ProductName", "Price", "Catagory",
						"inventoryqty");
				// ProducDetail[] ProductList = null;
				System.out.println();
				System.out.println("------------------------------------------------------");
				for (Product p : new ProductPostgres().retrieveProducts()) {
					System.out.printf("%-8s%-15s%-8s%-12s%-8s", p.getProdId(), p.getProdName(), "$" + p.getPrice(),
							p.getCatagory(), p.getInventoryQty());
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
					System.out.println("Please Enter Product Name");
					String productName = scan.nextLine();
					Product p = new ProductPostgres().retrieveproductByName(productName);
					if (p != null) {
						cart.add(p);
						int qty = 0;
						for (Product cartItem : cart) {
							if (cartItem.getProdName().equals(productName)) {
								qty = qty + 1;

							}
						}
						Product temp = new Product();
						temp.setProdName(p.getProdName());
						temp.setProdId(p.getProdId());
						temp.setCatagory(p.getCatagory());
						temp.setPrice(p.getPrice());
						temp.setSalesQty(p.getSalesQty());
						temp.setInventoryQty(p.getInventoryQty() - qty);
						new ProductPostgres().updateProduct(temp);

					}

					else {

						System.out.println("Sorry the Product doesnot Exist");
					}
					break;
				}

				case "2": {
					System.out.println("\n-------My Cart ----------");
					System.out.printf("%-8s%-15s%-8s%-12s", "Prodid", "ProductName", "Price", "Catagory");
					System.out.println();
					for (Product p : cart) {

						System.out.printf("%-8s%-15s%-8s%-12s", p.getProdId(), p.getProdName(), "$" + p.getPrice(),
								p.getCatagory());
						System.out.println();
					}
					System.out.println("\n");
					break;
				}

				case "3": {
					System.out.println("Thank you For Shopping With US !");

					System.exit(0);

				}
				default:
					System.out.println("Please Select 1 or 2");
				}

			}

		}
	}
}