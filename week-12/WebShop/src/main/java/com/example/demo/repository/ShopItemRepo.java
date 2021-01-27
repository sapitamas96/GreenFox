package com.example.demo.repository;

import com.example.demo.model.ShopItem;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
public class ShopItemRepo {

    private List<ShopItem> shopItems;

    public ShopItemRepo() {
        this.shopItems = new ArrayList<>();
    }

    @PostConstruct
    private void init() {
        shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
        shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
        shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25, 0));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
        shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1));
    }
}
