package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ShopItem {

    private String name;
    private String description;
    private Integer price;
    private Integer quantity;
}
