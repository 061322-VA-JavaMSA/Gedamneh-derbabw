package com.revature;

import java.util.ArrayList;
import java.util.List;
public class Cartutility {

	 
	public static List<Cart> cartList= new ArrayList<>();
	public static void addProductToCart(Cart cart){
	
	int index=-1;
	Cart temp=null;
	for(Cart c : cartList) {
	
	index++;
	if(c.getProdid().equals(cart.getProdid())) {
		
		
		temp = c;
	break;
	
	
	}

if(temp==null) {
	cartList.add(cart);
	System.out.println("....Product added to Cart....");
	}
	
	else {
		temp.setQty(temp.getQty()+cart.getQty());
		cartList.set(index,temp);
		System.out.println("......Cart Updated......");
		
		//Decrease the inventory
		Product p = ProducDetail.findProduct(cart.getProdid());
			p.setInventory( p.getInventory()- cart.getQty());	
	}
	
	
	}
	
}
}	
