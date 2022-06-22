package com.revature;

import java.util.Objects;

public class Product {
	
	private String prodid;
	private String prodname;
	private String catagory;
	private int price;
	private int Qty;
	//public Product(String string, String string2, String string3, int i, int j) {
		// TODO Auto-generated constructor stub
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String prodid, String prodname, String catagory, int price, int qty) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.catagory = catagory;
		this.price = price;
		Qty = qty;
	}
	//public void Product(String string, String string2, String string3, int i, int j) {
		// TODO Auto-generated constructor stub
	//}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
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
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", price=" + price + ", Qty=" + Qty + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Qty, price, prodid, prodname);
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
	public String getProdID() {
		// TODO Auto-generated method stub
		return prodid;
	}
	public String getpCatagory() {
		// TODO Auto-generated method stub
		return catagory;
	}
	public String getInventory() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getProductPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	


}
