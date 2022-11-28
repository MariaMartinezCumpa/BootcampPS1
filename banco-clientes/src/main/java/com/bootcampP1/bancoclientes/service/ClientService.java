package com.bootcampP1.bancoclientes.service;

import com.bootcampP1.bancoclientes.dto.ClientDto;
import com.bootcampP1.bancoclientes.entity.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    public Mono<ClientDto> getOne(String document);

    public Flux<ClientDto> getAll();

    public Mono<ClientDto> save(ClientDto clientDto);

    public Mono<ClientDto> update(ClientDto clientDto);

    public Mono<Void>   delete(String document);
    public Mono<ClientDto> getOneById(String id);

}
