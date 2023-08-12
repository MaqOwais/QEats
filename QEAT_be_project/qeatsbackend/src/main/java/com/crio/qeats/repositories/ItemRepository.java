
package com.crio.qeats.repositories;

import com.crio.qeats.models.ItemEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

// @Repository
public interface ItemRepository extends MongoRepository<ItemEntity, String> {
    @Query("{name : ?0}")
    Optional<ItemEntity> findRestaurantsByItemName(String name);
    @Query("{attributes: { $in: ?0 } })")
    List<ItemEntity> findRestaurantsByItemAtt(String attributes);
}

