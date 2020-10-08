package com.ifi.model;

import java.io.Serializable;

public class Car implements Serializable {

    private int id;
    private String name;
    private long price;
    private CarBrand brand;
    private String model;

    public Car() {
    }

    public Car(int id, String name, long price, CarBrand brand, String model) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.model = model;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", model=" + model + '}';
    }
}
