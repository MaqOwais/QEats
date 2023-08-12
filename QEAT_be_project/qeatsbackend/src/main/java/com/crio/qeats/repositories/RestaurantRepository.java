/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.repositories;

import com.crio.qeats.dto.Restaurant;
import com.crio.qeats.models.RestaurantEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

// @Repository
public interface RestaurantRepository extends MongoRepository<RestaurantEntity, String> {

	@Query("{name : ?0}") // ? is it correct as it's giving 5 restaurants insead of 4
  	Optional<RestaurantEntity> findRestaurantsByNameExact(String name);

	@Query("{attributes : ?0}")
  	Optional<RestaurantEntity> findRestaurantsByAttributesExact(String attributes);

	@Query("{restaurantId: { $in: ?0 } })")
  	List<RestaurantEntity> findRestaurantsByid(List<String> restaurantId);
}

