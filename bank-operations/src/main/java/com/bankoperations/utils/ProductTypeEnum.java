package com.bankoperations.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ProductTypeEnum {
    PASIVE("Pasivos"),
    ACTIVE("Activos");
    @Getter
    private String name;
}
