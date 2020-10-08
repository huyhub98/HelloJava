package com.ifi.model;

import java.io.Serializable;
import java.util.Scanner;

import com.ifi.utils.CarConst;
import com.ifi.utils.CarEnum;

public class Vinfast extends Car implements Serializable {

    private String brand = CarEnum.VINFAST.getBrand();
    private String model;

    public Vinfast() {
        super();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vinfast [brand=" + brand + ", model=" + model + "]";
    }

}
