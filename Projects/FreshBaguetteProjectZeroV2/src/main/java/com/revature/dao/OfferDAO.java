package com.revature.dao;

import java.util.List;

import com.revature.model.Offer;

public interface OfferDAO {
	Offer get(int offer_id);

	List<Offer> getAll();

	Offer createOffer(Offer offer);

	boolean updateOffer(Offer offer);

	boolean deleteOffer(int offer_id);
}
