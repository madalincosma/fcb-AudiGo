package com.audi.myaudi.trippy;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

@Entity
public class UserStats implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@JoinColumn(name = "userId")
	@NotNull
	private User user;

	private int rating;
	private int driverTripsCount;
	private int passengerTripsCount;
	private boolean paidAccount;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getDriverTripsCount() {
		return driverTripsCount;
	}

	public void setDriverTripsCount(int driverTripsCount) {
		this.driverTripsCount = driverTripsCount;
	}

	public int getPassengerTripsCount() {
		return passengerTripsCount;
	}

	public void setPassengerTripsCount(int passengerTripsCount) {
		this.passengerTripsCount = passengerTripsCount;
	}

	public boolean vipReady() {
		return driverTripsCount > 1 || paidAccount;
	}
}
