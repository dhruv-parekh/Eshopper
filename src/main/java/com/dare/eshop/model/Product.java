package com.dare.eshop.model;

public class Product {

    private int productId;
    private String title;
    private double price;
    private String  coverPicUrl;

    public Product(){}
    public Product(int productId, String title, double price, String coverPicUrl) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.coverPicUrl = coverPicUrl;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }
}
