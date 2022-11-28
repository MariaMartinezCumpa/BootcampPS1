package com.bootcampP1.bancoproducts.repository;

import com.bootcampP1.bancoproducts.entity.ProductEntity;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<ProductEntity, ObjectId> {
}
