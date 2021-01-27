package com.example.demo.services;

import com.example.demo.model.ShopItem;

import java.util.List;

public interface DataBaseService {

    List<ShopItem> getShopItems();

    List<ShopItem> getOnlyAvailable();

    List<ShopItem> getCheapestFirst();

    List<ShopItem> getByDescription(String text);

    double getAverageStock();

    ShopItem getMostExpensive();

    List<ShopItem> searchByNameAndDescription(String text);
}
