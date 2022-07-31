package com.example.assignmentt2009m1springboot.entity;

import com.example.assignmentt2009m1springboot.entity.enums.ProductSimpleStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String slug;
    private String description;
    private String detail;
    private String thumbnails;
    private BigDecimal price;
    @Enumerated(EnumType.ORDINAL)
    private ProductSimpleStatus status;

    public Product(){

    }
}
