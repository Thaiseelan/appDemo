package com.example.appDemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class products {
    @Id
    private int prodId;
    private String prodName;
    private double price;
    public products() {
    }
    public products(int prodId, String prodName, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}