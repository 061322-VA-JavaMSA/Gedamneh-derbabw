package com.revature.model;

import java.time.LocalDate;

public class Offer {
	private Product product;
	private User user;
	private LocalDate offer_date;
	private double offer_amount;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDate getOffer_date() {
		return offer_date;
	}

	public void setOffer_date(LocalDate offer_date) {
		this.offer_date = offer_date;
	}

	public double getOffer_amount() {
		return offer_amount;
	}

	public void setOffer_amount(double offer_amount) {
		this.offer_amount = offer_amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(offer_amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((offer_date == null) ? 0 : offer_date.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Offer other = (Offer) obj;
		if (Double.doubleToLongBits(offer_amount) != Double.doubleToLongBits(other.offer_amount))
			return false;
		if (offer_date == null) {
			if (other.offer_date != null)
				return false;
		} else if (!offer_date.equals(other.offer_date))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Offer [product=" + product + ", user=" + user + ", offer_date=" + offer_date + ", offer_amount="
				+ offer_amount + "]";
	}

}
