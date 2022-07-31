package com.example.assignmentt2009m1springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class OrderDetailId implements Serializable {
    private static final long serialVersionUID = 4522597962884128146L;
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "product_id")
    private String productId;
}

