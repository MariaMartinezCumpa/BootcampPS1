package com.bootcampP1.bancoproducts.service;

import com.bootcampP1.bancoproducts.entity.ProductEntity;
import com.bootcampP1.bancoproducts.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Mono<ProductEntity> getOne(String name) {
        Mono<ProductEntity> oneProduct = productRepository.findAll().filter(x -> x.getName().equals(name)).next();
        return oneProduct;
    }

    @Override
    public Flux<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Mono<ProductEntity> save(ProductEntity newProduct) {
        return productRepository.save(newProduct);
    }

    @Override
    public Mono<ProductEntity> update(String name, String type) {
        Mono<ProductEntity> product = getOne(name);
        ProductEntity productFound = product.block();
        productFound.setType(type);
        return productRepository.save(productFound);
    }

    @Override
    public Mono<Void> delete(String name) {
        Mono<ProductEntity> product = getOne(name);
        ProductEntity productFound = product.block();
        return productRepository.deleteById(productFound.getId());
    }
}
