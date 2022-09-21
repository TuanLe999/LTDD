package com.example.bt5_taolist;

public class Product {
    int img;
    String name;
    int price;
    int productID;
    int total;

    public Product(int img, String name, int price, int productID, int total) {
        this.img = img;
        this.name = name;
        this.price = price;
        this.productID = productID;
        this.total = total;
    }

    public Product(int img,int productID, String name, int price) {
        this.img = img;
        this.name = name;
        this.price = price;
        this.productID = productID;
        this.total = 0;
    }
}
