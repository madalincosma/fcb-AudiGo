package com.audi.myaudi.trippy;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Pickup {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long pickupId;
	
	@OneToOne()
	@JoinColumn(name = "userId")
	@NotNull
	private User user;
	
	@OneToOne
	@JoinColumn(name = "gameId")
	@NotNull
	private FCBGame game;
	private String latitude;
	private String longitude;
	private LocalDateTime dateTime;
	
	@OneToOne
	@JoinColumn(name = "pickedByUserId")
	private User pickedByUser;
	private String pickupLatitude;
	private String pickupLongitude;
	
	
	public Long getPickupId() {
		return pickupId;
	}
	public void setPickupId(Long pickupId) {
		this.pickupId = pickupId;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getPickedByUser() {
		return pickedByUser;
	}
	public void setPickedByUser(User pickedByUser) {
		this.pickedByUser = pickedByUser;
	}
	
	public String getLatitude() {
		return latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getPickupLatitude() {
		return pickupLatitude;
	}
	public void setPickupLatitude(String pickupLatitude) {
		this.pickupLatitude = pickupLatitude;
	}
	public String getPickupLongitude() {
		return pickupLongitude;
	}
	public void setPickupLongitude(String pickupLongitude) {
		this.pickupLongitude = pickupLongitude;
	}
	
	

}
