package com.dare.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopHomeController {


    @GetMapping("/")
    public String gotoIndex(){
        return "index";
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

    @GetMapping("/shop")
    public String gotoShop(){
        return "shop";
    }

    @GetMapping("/contact")
    public String gotoContact(){
        return "contact";
    }

}
