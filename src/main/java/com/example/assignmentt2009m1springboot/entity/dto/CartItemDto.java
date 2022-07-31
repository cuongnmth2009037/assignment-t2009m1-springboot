package com.example.assignmentt2009m1springboot.entity.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItemDto {
    private String productId;
    private int quantity;
}
