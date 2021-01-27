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
       model.addAttribute("shopItems", dataBaseService.getCheapestFirst());
        return "index";
    }

    @GetMapping("contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("table", true);
        model.addAttribute("shopItems", dataBaseService.getByDescription("nike"));
        return "index";
    }

    @GetMapping( "average-stock")
    public String averageStock(Model model) {
        model.addAttribute("table", false);
        model.addAttribute("avg", dataBaseService.getAverageStock());
        return "index";
    }

    @GetMapping( "most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("table", true);
        model.addAttribute("shopItems", dataBaseService.getMostExpensive());
        return "index";
    }

    @PostMapping("search")
    public String search(String text, Model model) {
        model.addAttribute("table", true);
        model.addAttribute("shopItems", dataBaseService.searchByNameAndDescription(text));
        return "index";
    }




}
