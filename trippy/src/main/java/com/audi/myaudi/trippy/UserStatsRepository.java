package com.audi.myaudi.trippy;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource(collectionResourceRel = "userStats", path = "userStats")
public interface UserStatsRepository extends PagingAndSortingRepository<UserStats, User> {
	
//	public List<User> findByUser_Username(@RequestParam String username);

}
