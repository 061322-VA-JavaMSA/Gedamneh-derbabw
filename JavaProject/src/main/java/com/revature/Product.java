package com.revature;

public class Product {
	
	
    private String prodID;
	private String proName;
    private String pCatagory;
	private  int Price;
	private  int Inventory;
	public String getProdID() {
		return prodID;
	}
	public void setProdID(String prodID) {
		this.prodID = prodID;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getpCatagory() {
		return pCatagory;
	}
	public void setpCatagory(String pCatagory) {
		this.pCatagory = pCatagory;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getInventory() {
		return Inventory;
	}
	public void setInventory(int inventory) {
		Inventory = inventory;
	}
	@Override
	public String toString() {
		return "Product [prodID=" + prodID + ", proName=" + proName + ", pCatagory=" + pCatagory + ", Price=" + Price
				+ ", Inventory=" + Inventory + "]";
	}
	public Product(String prodID, String proName, String pCatagory, int price, int inventory) {
		super();
		this.prodID = prodID;
		this.proName = proName;
		this.pCatagory = pCatagory;
		Price = price;
		Inventory = inventory;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProductPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}