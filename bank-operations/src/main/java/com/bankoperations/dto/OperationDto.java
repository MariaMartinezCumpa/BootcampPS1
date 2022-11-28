package com.bankoperations.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperationDto {
    private String document;
    private String idTypeProduct;
    private String pass;
}
