package com.bootcampP1.bancoproducts.utils;

import lombok.Data;

//@Data
public enum ProductTypeEnum {
    PASIVE("Pasivos"),
    ACTIVE("Activos");
    private String name;

    ProductTypeEnum(String name) {
        this.name = name;
    }
}
