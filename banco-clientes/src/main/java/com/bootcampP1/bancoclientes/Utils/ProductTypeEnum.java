package com.bootcampP1.bancoclientes.Utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ProductTypeEnum {
    PASIVE("Pasivos"),
    ACTIVE("Activos");
    @Getter
    private String name;
}
