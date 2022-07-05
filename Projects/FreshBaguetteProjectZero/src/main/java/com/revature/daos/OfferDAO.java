package com.revature.daos;

import java.util.List;

import com.revature.models.Offer;

public interface OfferDAO {
	Offer createOffer(Offer o);
	List<Offer> retrievePendingOffers();
	boolean desicionOffer(Offer o);
}
