package com.revature;

import java.util.Objects;

public class Cart {

	private int custid;
	private String prodid;
	private int price;
	private int Qty;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
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
		Cart other = (Cart) obj;
		return Qty == other.Qty && Objects.equals(custid, other.custid) && price == other.price
				&& Objects.equals(prodid, other.prodid);
	}
	@Override
	public String toString() {
		return "Cart [custid=" + custid + ", prodid=" + prodid + ", price=" + price + ", Qty=" + Qty + "]";
	}
	public Cart(Object object, String prodid, int price, int qty) {
		super();
		this.custid = (int) object;
		this.prodid = prodid;
		this.price = price;
		Qty = qty;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int custid2, String prodID2, int productPrice, int inventory) {
		// TODO Auto-generated constructor stub
	}


}