package com.bankoperations.entity;

import com.bankoperations.dto.Client;
import lombok.Data;

import java.util.Date;
@Data
public class Operation {
    private Client client;
    private ProductClient product;
    private String operationBankingType;
    private Double operationAmount;
    private Date date;
    private Boolean isActive;
    private String replyMessage;

}
