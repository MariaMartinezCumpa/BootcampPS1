package com.bankoperations.service;

import com.bankoperations.dto.OperationDto;
import com.bankoperations.entity.Operation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OperationService {
    public Mono<Operation> getOne(String document);

    public Flux<Operation> getAll();

    public Mono<Operation> createAccount(OperationDto clientDto);
    public Mono<Operation> createCredit(OperationDto clientDto);

    public Mono<Operation> consultAccountCreditByDocument(String document, String nroAccount,String amount);

    public Mono<Operation>   toDeposit(String document);
    public Mono<Operation> retirement(String id);
}
