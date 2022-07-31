package com.example.assignmentt2009m1springboot.entity.dto;

import com.example.assignmentt2009m1springboot.entity.ShoppingCart;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingCartDto {
    private String id;
    private String userId;
    private BigDecimal totalPrice;
    private String shipName;
    private String shipAddress;
    private String shipPhone;
    private String shipNote;
    private Set<CartItemDto> items;

    public ShoppingCart generateCart(){
        return new ShoppingCart();
    }
}
