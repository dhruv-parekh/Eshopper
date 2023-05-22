package com.dare.eshop.controller;

import com.dare.eshop.model.Product;
import com.dare.eshop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ShopHomeController {

    @Autowired
    private ShopService shopService;


    @GetMapping("/")
    public String gotoIndex(Model model){
        model.addAttribute("product",new Product());
        return "index";
    }

    @GetMapping("/shop")
    public String gotoShop(Model model){

        List<Product> productList = shopService.getAllProducts();
        model.addAttribute("productList", productList);
        model.addAttribute("product",new Product());
        return "shop";
    }

    @PostMapping("/shop")
    public String filterProducts(Model model, @ModelAttribute Product product){

        System.out.println("controller"+product.getTitle());
        List<Product> productList = shopService.filterProducts(product.getTitle());
        model.addAttribute("productList", productList);
        model.addAttribute("product",new Product());
        return "shop";
    }

    @GetMapping("/cart")
    public String gotoCart(){
        return "cart";
    }

    @GetMapping("/checkout")
    public String gotocheckout(){
        return "checkout";
    }

    @GetMapping("/detail")
    public String gotoDetail(){
        return "detail";
    }

    @GetMapping("/contact")
    public String gotoContact(){
        return "contact";
    }

}
