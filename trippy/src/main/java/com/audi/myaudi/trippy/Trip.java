package com.audi.myaudi.trippy;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity()
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"userId", "gameId"})})  
public class Trip {
	public enum Status {
		CREATED, ADVERTISED, COMPLETED, CANCELLED
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long tripId;
	
	@OneToOne
	@JoinColumn(name = "userId")
	@NotNull
	private User user;
	
	@OneToOne
	@JoinColumn(name = "gameId")
	@NotNull
	private FCBGame game;
	private String startLatitude;
	private String startLongitude;
	private String endLatitude;
	private String endLongitude;
	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;
	private Status status;	

	public Long getTripId() {
		return tripId;
	}

	public void setTripId(Long tripId) {
		this.tripId = tripId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public FCBGame getGame() {
		return game;
	}

	public void setGame(FCBGame game) {
		this.game = game;
	}

	public String getStartLatitude() {
		return startLatitude;
	}

	public void setStartLatitude(String startLatitude) {
		this.startLatitude = startLatitude;
	}

	public String getStartLongitude() {
		return startLongitude;
	}

	public void setStartLongitude(String startLongitude) {
		this.startLongitude = startLongitude;
	}

	public String getEndLatitude() {
		return endLatitude;
	}

	public void setEndLatitude(String endLatitude) {
		this.endLatitude = endLatitude;
	}

	public String getEndLongitude() {
		return endLongitude;
	}

	public void setEndLongitude(String endLongitude) {
		this.endLongitude = endLongitude;
	}

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
