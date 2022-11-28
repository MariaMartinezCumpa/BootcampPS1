package com.bankoperations.repository;

import com.bankoperations.entity.Operation;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends ReactiveCrudRepository<Operation, ObjectId> {
}
