package com.revature;

import java.util.Objects;

public class Customer {
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
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
	public int hashCode() {
		return Objects.hash(Qty, custid, price, prodid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Qty == other.Qty && Objects.equals(custid, other.custid) && price == other.price
				&& Objects.equals(prodid, other.prodid);
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", prodid=" + prodid + ", price=" + price + ", Qty=" + Qty + "]";
	}
	public Customer(String custid, String prodid, int price, int qty) {
		super();
		this.custid = custid;
		this.prodid = prodid;
		this.price = price;
		Qty = qty;
	}
	private String custid;
	private String prodid;
	private int price;
	private int Qty;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getcustid() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
