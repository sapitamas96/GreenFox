package com.example.demo.services;

import com.example.demo.model.ShopItem;
import com.example.demo.repository.ShopItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataBaseServiceIpl implements DataBaseService {

    private final ShopItemRepo shopItemRepo;

    @Autowired
    public DataBaseServiceIpl(ShopItemRepo shopItemRepo) {
        this.shopItemRepo = shopItemRepo;
    }

    @Override
    public List<ShopItem> getShopItems() {
        return shopItemRepo.getShopItems();
    }

    @Override
    public List<ShopItem> getOnlyAvailable() {
        return getShopItems().stream().filter(item -> item.getQuantity() > 0).collect(Collectors.toList());
    }
}
