package com.example.assignmentt2009m1springboot.entity.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String id;
    private String name;
    private String slug;
    private String description;
    private String detail;
    private String thumbnails;
    private BigDecimal price;
    private String createdAt;
    private String updatedAt;
    private String status;
}
