package com.bootcampP1.bancoproducts.service;

import com.bootcampP1.bancoproducts.entity.ProductEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    public Mono<ProductEntity> getOne(String name);

    public Flux<ProductEntity> getAll();

    public Mono<ProductEntity> save(ProductEntity newProduct);

    public Mono<ProductEntity> update(String name, String type);

    public Mono<Void> delete(String name);
}
