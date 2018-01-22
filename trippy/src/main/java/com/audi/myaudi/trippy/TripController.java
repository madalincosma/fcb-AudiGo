package com.audi.myaudi.trippy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tripx")
public class TripController {
	
	private static List<Trip> trips = new ArrayList<>();

	@GetMapping("/{tripId}")
	public Trip addTrip(@PathVariable String tripId) {
		Optional<Trip> first = trips.stream().filter(trip -> trip.getTripId().equals(tripId)).findFirst();
		return first.isPresent() ? first.get() : createTrip(tripId);
	}

	@PostMapping("/")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void getTrip(@RequestBody Trip trip) {
		trips.add(trip);
	}

	private Trip createTrip(String tripId) {
		Trip trip = new Trip();
//		trip.setTripId(tripId);
//		trip.setUserId("demo-user");
		return trip;
	}

}
