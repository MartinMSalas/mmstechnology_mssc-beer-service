package com.mmstechnology.mssc_beer_service.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.sql.Timestamp;

/*
 * Beer.java
 * Project: mmstechnology_mssc-beer-service, Created by M on 30/5/2025.
 * © 2025 mmstechnology
 */
@Data
@Entity
@Builder
public class Beer {

    @Id
    @UuidGenerator
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    private String beerId;
    @Version
    private Integer version;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    @UpdateTimestamp
    private Timestamp lastModifiedDate;

    private String beerName;
    private String beerStyle;
    @Column(unique = true)
    private Long upc;

    @Column(length = 500)
    private String description;

    private BigDecimal price;
    private Integer quantityOnHand;
    private Integer minOnHand;
    private Integer maxOnHand;
    private Integer quantityToBrew;

    // Additional fields and methods can be added as needed
}
