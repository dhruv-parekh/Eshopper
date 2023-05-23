package com.dare.eshop.service;

import com.dare.eshop.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {
    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"game",120,"https://yt3.googleusercontent.com/447XAt80-ow7poHghoEV2f_0xf-QypVPzTqEFlwVsvijrS56-dpTU3ICge4OP48V8nfk6x5j"));
        productList.add(new Product(2,"movie",12,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLp7HepZrPccmlBuhEoXVAuDa4-PYJQs9y2A&usqp=CAU"));
        productList.add(new Product(3,"car",12000,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEYPKdn1ad34Ok5X20cFbktRNGDddYky--kw&usqp=CAU"));
        productList.add(new Product(4,"game",120,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr5fg1ewYohWmpc7Wg7_gNkzTGgjjecnb3pA&usqp=CAU"));

        return productList;
    }

    public List<Product> filterProducts(String title) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"game",120,"https://yt3.googleusercontent.com/447XAt80-ow7poHghoEV2f_0xf-QypVPzTqEFlwVsvijrS56-dpTU3ICge4OP48V8nfk6x5j"));
        productList.add(new Product(2,"movie",12,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLp7HepZrPccmlBuhEoXVAuDa4-PYJQs9y2A&usqp=CAU"));
        productList.add(new Product(3,"car",12000,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEYPKdn1ad34Ok5X20cFbktRNGDddYky--kw&usqp=CAU"));
        productList.add(new Product(4,"game",120,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr5fg1ewYohWmpc7Wg7_gNkzTGgjjecnb3pA&usqp=CAU"));


        List<Product> filteredProducts = new ArrayList<>();
        for(Product p :productList){

            if(p.getTitle().equalsIgnoreCase(title)){
                System.out.println("URL : "+p.getCoverPicUrl());
                filteredProducts.add(p);
            }

        }

        return filteredProducts;
    }
}
