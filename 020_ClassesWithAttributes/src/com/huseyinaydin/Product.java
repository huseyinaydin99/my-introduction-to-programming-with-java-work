package com.huseyinaydin;

public class Product {
    //attribute | filed deniyor
    private int id;
    private String name;
    private String description;
    private double price;
    private byte stockAmount;

    public Product(int id, String name, String description, double price, byte stockAmount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(byte stockAmount) {
        this.stockAmount = stockAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stockAmount=" + stockAmount +
                '}';
    }
}
