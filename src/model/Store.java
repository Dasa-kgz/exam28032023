package model;

import enums.StpryTypes;

import java.util.List;

public class Store {
    private int id;
    private String name;
    StpryTypes stpryTypes;
    private String location;
    List<Product>products;

    public Store(int id, String name, StpryTypes stpryTypes, String location, List<Product> products) {
        this.id = id;
        this.name = name;
        this.stpryTypes = stpryTypes;
        this.location = location;
        this.products = products;
    }

    public Store() {
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

    public StpryTypes getStpryTypes() {
        return stpryTypes;
    }

    public void setStpryTypes(StpryTypes stpryTypes) {
        this.stpryTypes = stpryTypes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stpryTypes=" + stpryTypes +
                ", location='" + location + '\'' +
                ", products=" + products +
                '}';
    }
}
