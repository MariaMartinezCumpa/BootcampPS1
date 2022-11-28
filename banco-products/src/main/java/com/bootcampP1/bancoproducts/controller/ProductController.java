package com.bootcampP1.bancoproducts.controller;

import com.bootcampP1.bancoproducts.entity.ProductEntity;
import com.bootcampP1.bancoproducts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/getOne/{name}")
    public Mono<ProductEntity> getOne(@PathVariable String name) {
        return productService.getOne(name);
    }

    @GetMapping(value = "/getAll")
    public Flux<ProductEntity> getAll() {
        return productService.getAll();
    }

    @PostMapping(value = "/save")
    public Mono<ProductEntity> save(@RequestBody ProductEntity newProduct) {
        return productService.save(newProduct);
    }

    @PutMapping(value = "/update/{name}/{type}")
    public Mono<ProductEntity> update(@PathVariable("name") String name, @PathVariable("type") String type) {
        return productService.update(name, type);
    }

    @DeleteMapping(value = "/delete/{name}")
    public Mono<Void> delete(@PathVariable String name) {
        return productService.delete(name);
    }
}
