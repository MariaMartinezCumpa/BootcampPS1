package com.bootcampP1.bancoclientes.entity;

import com.bootcampP1.bancoclientes.Utils.ProductTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Product")
public class Product {
    @Id
    private ObjectId id;
    private String name;
    private String type;
    //passives
    private Boolean hasMaintenanceCommission;
    private Double maintenanceCommissionAmmount;
    private Integer maxNroOperation;
    //
    //actives
    private Integer maxNroCredits;
    //
    private Boolean isActive;


}
