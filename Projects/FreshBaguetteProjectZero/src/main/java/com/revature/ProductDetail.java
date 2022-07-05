package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.revature.models.Product;

public class ProductDetail extends Product {

	public static List<Product>  productList = new ArrayList<>();

//	static {
//		productList.add(new Product("B101", " Baguette ", "Bread  ", 4, 200));
//		productList.add(new Product("E101", " Eclair ", "Pastry ", 5, 300));
//		productList.add(new Product("C101", " Kouignamann ", "Croissant  ", 4, 200));
//		productList.add(new Product("P101", " Parsian ", "Sandwitchs  ", 4, 200));
//		productList.add(new Product("C101", " Coke ", "Beverage  ", 2, 100));
//		productList.add(new Product("M101", " Madelene ", "Sweet  ", 2, 40));
//		productList.add(new Product("Q101", " Quiche ", "Savory  ", 7, 50));
//
//		// p.getProdid().equals(prodID)
//	}

	/**
	 * @param prodID
	 * @return
	 */
//	public static String getProductName(String prodID) {
//
//		String proName = " ";
//		for (Product p : productList) {
//
//			if (p.getProdId().equals(prodID)) {
//				proName = p.getProdname();
//				break;
//			}
//		}
//		return proName;
//	}
//
//	public static int getProductPrice(String prodID) {
//
//		int proPrice = 0;
//		for (Product p : productList) {
//
//			if (p.getProdid().equals(prodID)) {
//				proPrice = p.getPrice();
//				break;
//			}
//		}
//		return proPrice;
//
//	}

//	public static Product findProduct(String prodid) {
//
//		Product temp = null;
//		for (Product p : productList) {
//			
//	 
//			if (Objects.equals(p.getProdid(),prodid)) {
//				temp = p;
//				break;
//			}
//		}
//		return temp;
//	}

}
