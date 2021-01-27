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

    @Override
    public List<ShopItem> getCheapestFirst() {
        return getShopItems().stream().sorted((o1, o2) -> o1.getPrice().compareTo(o2.getPrice())).collect(Collectors.toList());
    }

    @Override
    public List<ShopItem> getByDescription(String text) {
        return getShopItems().stream().filter(item -> item.getDescription().toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList());
    }

    @Override
    public double getAverageStock() {
        return getShopItems().stream().map(ShopItem::getQuantity).mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public ShopItem getMostExpensive() {
        return getShopItems().stream().max((o1, o2) -> o1.getPrice().compareTo(o2.getPrice())).orElse(null);
    }

    @Override
    public List<ShopItem> searchByNameAndDescription(String text) {
        List<ShopItem> result = getShopItems().stream().filter(item -> item.getName().toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList());

        if (result.isEmpty()) {
            return getByDescription(text);
        }
        return result;
    }
}
