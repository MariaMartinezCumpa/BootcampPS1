package com.bootcampP1.bancoclientes.repository;

import com.bootcampP1.bancoclientes.entity.Client;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.stream.DoubleStream;

@Repository
public interface ClientRepository extends ReactiveCrudRepository<Client, ObjectId> {
    Flux<Client> findByNroDocument(final String nroDocument);
}
