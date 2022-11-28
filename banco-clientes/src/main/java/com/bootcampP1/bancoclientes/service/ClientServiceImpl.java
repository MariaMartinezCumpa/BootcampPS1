package com.bootcampP1.bancoclientes.service;

import com.bootcampP1.bancoclientes.dto.ClientDto;
import com.bootcampP1.bancoclientes.entity.Client;
import com.bootcampP1.bancoclientes.mapper.ClientMapper;
import com.bootcampP1.bancoclientes.repository.ClientRepository;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {

    private static final Logger log = LoggerFactory.getLogger(ClientServiceImpl.class);
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Mono<ClientDto> getOne(String document) {
        return clientRepository.findByNroDocument(document).filter(client -> client.getNroDocument()
                .equals(document) && Boolean.TRUE.equals(client.getIsActive())).map(ClientMapper::mapToClientDto).next();
    }

    @Override
    public Flux<ClientDto> getAll() {
        return clientRepository.findAll().filter(client -> Boolean.TRUE.equals(client.getIsActive())).map(ClientMapper::mapToClientDto);
    }

    @Override
    public Mono<ClientDto> save(ClientDto clientDto) {
        return clientRepository.save(ClientMapper.mapToClient(clientDto)).map(ClientMapper::mapToClientDto);
    }

    @Override
    public Mono<ClientDto> update(ClientDto clientDto) {
        Mono<ClientDto> clientDtoFoundMono = this.getOne(clientDto.getNroDocument());
        return clientDtoFoundMono.map(clientDtoFound -> {
            clientDtoFound.setType(clientDto.getType());
            clientDtoFound.setName(clientDto.getName());
            clientRepository.save(ClientMapper.mapToClient(clientDtoFound));
            return clientDtoFound;
        });
    }

    @Override
    public Mono<Void> delete(String document) {
        Mono<ClientDto> clientFoundDtoMono = this.getOne(document);

        clientFoundDtoMono.blockOptional().map(clientDto -> {
            Client client = ClientMapper.mapToClient(clientDto);
            client.setIsActive(false);
            clientRepository.save(client);
            return client;
        });
        return Mono.empty();
    }

    @Override
    public Mono<ClientDto> getOneById(String id) {
        return clientRepository.findById(new ObjectId(id)).map(ClientMapper::mapToClientDto);
    }
}
