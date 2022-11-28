package com.bootcampP1.bancoclientes.entity;

import com.bootcampP1.bancoclientes.Utils.OperationBankingTypeEnum;
import lombok.Data;

import java.util.Date;

@Data
public class Operations {
    private Client client;
    private ProductsClients product;
    private String operationBankingTypeEnum;
    private Double operationAmount;
    private Date date;
    private Boolean isActive;

}
