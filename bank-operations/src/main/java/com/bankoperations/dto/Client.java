package com.bankoperations.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "client")
public class Client {
    @Id
    private ObjectId id;
    private String name;

    private String type;
    @Field("nro_document")
    private String nroDocument;
    @Field("type_document")
    private String typeDocument;
    private Date dateReg;
    private Boolean isActive = true;
}
