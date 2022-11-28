package com.bankoperations.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ClientTypeEnum {
    EMPRESARIAL("Empresarial"),
    PERSONAL("Personal");
    @Getter
    private String name;

}
