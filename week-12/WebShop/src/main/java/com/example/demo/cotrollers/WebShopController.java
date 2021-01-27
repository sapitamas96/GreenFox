package com.example.demo.cotrollers;
import com.example.demo.model.ShopItem;
import com.example.demo.services.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class WebShopController {

    private final DataBaseService dataBaseService;

    @Autowired
    public WebShopController(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    @GetMapping("webShop")
    public String index(Model model) {
        model.addAttribute("table", true);
        model.addAttribute("shopItems", dataBaseService.getShopItems());
        return "index";
    }

    @GetMapping("only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("table", true);
        model.addAttribute("shopItems", dataBaseService.getOnlyAvailable());
        return "index";
    }

    @GetMapping("cheapest-first")
    public String cheapestFirst(Model model) {
       model.addAttribute("table", true);
       List<ShopItem> cheapestFirstList = dataBaseService.getShopItems().stream().sorted((o1, o2) -> o1.getPrice().compareTo(o2.getPrice())).collect(Collectors.toList());
       model.addAttribute("shopItems", cheapestFirstList);
        return "index";
    }

    @GetMapping("contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("table", true);
        List<ShopItem> containsNikeList = dataBaseService.getShopItems().stream().filter(item -> item.getDescription().toLowerCase().contains("nike")).collect(Collectors.toList());
        model.addAttribute("shopItems", containsNikeList);
        return "index";
    }

    @GetMapping( "average-stock")
    public String averageStock(Model model) {
        model.addAttribute("table", false);
        double avg = dataBaseService.getShopItems().stream().map(ShopItem::getQuantity).mapToInt(Integer::intValue).average().orElse(0);
        model.addAttribute("avg", avg);
        return "index";
    }

    @GetMapping( "most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("table", true);
        ShopItem mostExpensiveItem = dataBaseService.getShopItems().stream().max((o1, o2) -> o1.getPrice().compareTo(o2.getPrice())).orElse(null);
        model.addAttribute("shopItems", mostExpensiveItem);
        return "index";
    }

    @PostMapping("search")
    public String search(String text, Model model) {
        List<ShopItem> containsNikeList = dataBaseService.getShopItems().stream().filter(item -> item.getDescription().toLowerCase().contains(text)).collect(Collectors.toList());
        model.addAttribute("table", true);
        model.addAttribute("shopItems", containsNikeList);
        return "index";
    }




}
