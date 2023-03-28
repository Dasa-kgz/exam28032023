package model;

import java.util.Collection;

public class Product {
    private int id;
    private String name;
    private String brand;
    private int qolichestvo;
    private double price;

    public Product(int id, String name, String brand, int qolichestvo, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.qolichestvo = qolichestvo;
        this.price = price;
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

    public Collection<? extends Product> getBrand() {
        return getBrand();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQolichestvo() {
        return qolichestvo;
    }

    public void setQolichestvo(int qolichestvo) {
        this.qolichestvo = qolichestvo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", qolichestvo=" + qolichestvo +
                ", price=" + price +
                '}';
    }
}
