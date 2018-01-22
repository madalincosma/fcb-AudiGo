package com.audi.myaudi.trippy;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "trip", path = "trip")
public interface TripRepository extends PagingAndSortingRepository<Trip, Long> {

}
