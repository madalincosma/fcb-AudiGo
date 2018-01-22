package com.audi.myaudi.trippy;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fcbgame", path = "fcbgame")
public interface FCBTicketRepository extends PagingAndSortingRepository<FCBGame, Long> {

}
