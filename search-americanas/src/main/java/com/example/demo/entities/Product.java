package com.example.demo.entities;

public class Product {
    private String category;
    private String description;
    private Double price;
    private String url;
    private String img;

    public Product() {
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() { return this.img; }

    public void setImg(String img) { this.img = img; }
}
