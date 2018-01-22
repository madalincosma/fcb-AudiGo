package com.audi.myaudi.trippy;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long userId;
	
	@Column(unique=true)
	private String username;
	private String first;
	private String last;
	private LocalDateTime expiresAt;
	private int defaultMaxPassengers;
	private float defaultRouteDeviation; //in km
	private int defaultStartTripBeforeGameStartOffset; //in minutes
	private int defaultArriveBeforeGameStartOffset; //in minutes
	
	
	public int getDefaultMaxPassengers() {
		return defaultMaxPassengers;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setDefaultMaxPassengers(int defaultMaxPassengers) {
		this.defaultMaxPassengers = defaultMaxPassengers;
	}
	public float getDefaultRouteDeviation() {
		return defaultRouteDeviation;
	}
	public void setDefaultRouteDeviation(float defaultRouteDeviation) {
		this.defaultRouteDeviation = defaultRouteDeviation;
	}
	public int getDefaultStartTripBeforeGameStartOffset() {
		return defaultStartTripBeforeGameStartOffset;
	}
	public void setDefaultStartTripBeforeGameStartOffset(int defaultStartTripBeforeGameStartOffset) {
		this.defaultStartTripBeforeGameStartOffset = defaultStartTripBeforeGameStartOffset;
	}
	public int getDefaultArriveBeforeGameStartOffset() {
		return defaultArriveBeforeGameStartOffset;
	}
	public void setDefaultArriveBeforeGameStartOffset(int defaultArriveBeforeGameStartOffset) {
		this.defaultArriveBeforeGameStartOffset = defaultArriveBeforeGameStartOffset;
	}
	public LocalDateTime getExpiresAt() {
		return expiresAt;
	}
	public void setExpiresAt(LocalDateTime expiresAt) {
		this.expiresAt = expiresAt;
	}	

}
