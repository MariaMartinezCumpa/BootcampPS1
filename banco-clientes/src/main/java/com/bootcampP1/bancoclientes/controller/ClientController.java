package com.bootcampP1.bancoclientes.controller;

import com.bootcampP1.bancoclientes.dto.ClientDto;
import com.bootcampP1.bancoclientes.entity.Client;
import com.bootcampP1.bancoclientes.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "clients")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping(value = "/getOne/{document}")
    public Mono<ClientDto> getOne(@PathVariable String document) {
        return clientService.getOne(document);
    }

    @GetMapping(value = "/getAll")
    public Flux<ClientDto> GetAll() {
        return clientService.getAll();
    }

    @PostMapping(value = "/save")
    public Mono<ClientDto> save(@RequestBody ClientDto clientDto) {
        return clientService.save(clientDto);
    }

    @PutMapping(value = "/update/{document}/{name}")
    public Mono<ClientDto> update(@RequestBody ClientDto clientDto) {
        return clientService.update(clientDto);
    }

    @DeleteMapping(value = "/delete/{document}")
    public Mono<Void> delete(@PathVariable String document) {
        return clientService.delete(document);
    }

    @GetMapping(value = "/getOneById/{id}")
    public Mono<ClientDto> getOneById(@PathVariable String id) {
        return clientService.getOneById(id);
    }
}
