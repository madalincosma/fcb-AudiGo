package com.audi.myaudi.trippy;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pickup", path = "pickup")
public interface PickupRepository extends PagingAndSortingRepository<Pickup, Long> {

}
