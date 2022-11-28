package com.bootcampP1.bancoclientes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto implements Serializable {
    private String id;
    private String name;
    private String type;
    @JsonProperty("document")
    private String nroDocument;
    @JsonProperty("type_document")
    private String typeDocument;
    private Date dateReg = new Date();
    private Boolean isActive = true;
    @Transient
    private String info;
}
