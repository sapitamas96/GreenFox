package com.example.demo.cotrollers;

import com.example.demo.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class WebShopController {

    private ArrayList<ShopItem> shopItems = new ArrayList<>();

    @PostConstruct
    private void init() {
        shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
        shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
        shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25, 0));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
        shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1));
    }

    @GetMapping(value = "webShop")
    public String index(Model model) {
        model.addAttribute("table", true);
        model.addAttribute("shopItems", shopItems);
        return "index";
    }

    @GetMapping(value = "only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("table", true);
        List<ShopItem> onlyAvailableList = shopItems.stream().filter(item -> item.getQuantity() > 0).collect(Collectors.toList());
        model.addAttribute("shopItems", onlyAvailableList);
        return "index";
    }

    @GetMapping(value = "cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("table", true);
       List<ShopItem> cheapestFirstList = shopItems.stream().sorted((o1, o2) -> o1.getPrice().compareTo(o2.getPrice())).collect(Collectors.toList());
       model.addAttribute("shopItems", cheapestFirstList);
        return "index";
    }

    @GetMapping(value = "contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("table", true);
        List<ShopItem> containsNikeList = shopItems.stream().filter(item -> item.getDescription().toLowerCase().contains("nike")).collect(Collectors.toList());
        model.addAttribute("shopItems", containsNikeList);
        return "index";
    }

    @GetMapping(value = "average-stock")
    public String averageStock(Model model) {
        model.addAttribute("table", false);
        double avg = shopItems.stream().map(ShopItem::getQuantity).mapToInt(Integer::intValue).average().orElse(0);
        model.addAttribute("avg", avg);
        return "index";
    }

    @GetMapping(value = "most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("table", true);
        ShopItem mostExpensiveItem = shopItems.stream().max((o1, o2) -> o1.getPrice().compareTo(o2.getPrice())).orElse(null);
        model.addAttribute("shopItems", mostExpensiveItem);
        return "index";
    }


}
