package com.bootcampP1.bancoclientes.Utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ClientTypeEnum {
    EMPRESARIAL("Empresarial"),
    PERSONAL("Personal");
    @Getter
    private String name;

}
