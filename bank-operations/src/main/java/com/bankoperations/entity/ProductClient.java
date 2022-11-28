package com.bankoperations.entity;

import com.bankoperations.dto.Client;
import com.bankoperations.dto.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "productsclients")
public class ProductClient {
    private Long id;
    @DBRef
    private List<Client> clients;
    private Double currentAmount;
    private Double initialAmount;
    //private Integer moneyType;
    private Date apertureDate;
    @DBRef
    private List<Product> products;
    private Boolean isActive;
}
