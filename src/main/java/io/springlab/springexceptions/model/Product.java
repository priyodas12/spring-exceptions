package io.springlab.springexceptions.model;

import java.io.Serializable;

public class Product implements Serializable {


    private static final long serialVersionUID = -4665965070554387387L;

    private int id;
    private String category;
    private double price;
    private String producer;

    protected Product(int id, String category, double price, String producer) {
        this.id = id;
        this.category = category;
        this.price = price;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
