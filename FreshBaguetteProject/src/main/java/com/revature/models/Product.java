package com.revature.models;

import java.util.Objects;

public class Product {
	
	private static final String Qty = null;
	private int prodid;
	private String prodname;
	private String catagory;
	private int price;
	private int inventoryqty;
	private int salesqty;
	//public Product(String string, String string2, String string3, int i, int j) {
		// TODO Auto-generated constructor stub
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodid, String prodname, String catagory, int price, int salesqty , int inventoryqty) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.catagory = catagory;
		this.price = price;
		this.inventoryqty = inventoryqty;
		this.salesqty=salesqty;
	}
	public Product(String string, String string2, String string3, int i, int j) {
		// TODO Auto-generated constructor stub
	}
	//public void Product(String string, String string2, String string3, int i, int j) {
		// TODO Auto-generated constructor stub
	//}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getsalesqty() {
		return salesqty;
	}
	public void setSalesQty(int salesqty) {
	this.salesqty = salesqty;
	}
	public void setInventoryQty(int inventoryqty) {
		this.inventoryqty = inventoryqty;
		}
	public String getProductPrice() {
		// TODO Auto-generated method stub
		return null;
	}

   public int getInventoryQty() {

	return this.inventoryqty;
     }
   

	
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", price=" + price + ", Qty=" + inventoryqty + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(inventoryqty, price, prodid, prodname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Qty == other.Qty && price == other.price && Objects.equals(prodid, other.prodid)
				&& Objects.equals(prodname, other.prodname);
	}
	public Object getProdID() {
		// TODO Auto-generated method stub
		return prodid ;
	}
	
	
	
	

}

