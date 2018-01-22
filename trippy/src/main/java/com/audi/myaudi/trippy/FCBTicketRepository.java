package com.audi.myaudi.trippy;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fcbticket", path = "fcbticket")
public interface FCBTicketRepository extends PagingAndSortingRepository<FCBTicket, Long> {

}
