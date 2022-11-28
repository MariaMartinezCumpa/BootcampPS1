package com.bankoperations.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum OperationBankingTypeEnum {
    RETIRO("Retiro"),
    DEPOSITO("Deposito"),
    PAGO("Pago"),
    CARGO("Cargo");

    @Getter
    private String name;
}
