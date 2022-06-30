package com.revature.models;

import java.util.Objects;

public class Product {

	private int prodId;
	private String prodName;
	private String catagory;
	private int price;
	private int salesQty;
	private int inventoryQty;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
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

	public int getSalesQty() {
		return salesQty;
	}

	public void setSalesQty(int salesQty) {
		this.salesQty = salesQty;
	}

	public int getInventoryQty() {
		return inventoryQty;
	}

	public void setInventoryQty(int inventoryQty) {
		this.inventoryQty = inventoryQty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(catagory, inventoryQty, price, prodId, prodName, salesQty);
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
		return Objects.equals(catagory, other.catagory) && inventoryQty == other.inventoryQty && price == other.price
				&& prodId == other.prodId && Objects.equals(prodName, other.prodName) && salesQty == other.salesQty;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", catagory=" + catagory + ", price=" + price
				+ ", salesQty=" + salesQty + ", inventoryQty=" + inventoryQty + "]";
	}

	// public Product(String string, String string2, String string3, int i, int j) {
	// TODO Auto-generated constructor stub

}
