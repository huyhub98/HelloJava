package com.ifi.model;

import java.io.Serializable;
import java.util.Scanner;

import com.ifi.utils.CarConst;
import com.ifi.utils.CarEnum;

public class Toyota extends Car implements Serializable {
    private static final long serialVersionUID = 8120814473023247149L;
    private String brand = CarEnum.TOYOTA.getBrand();
    private String model;

    public Toyota() {
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
        return "Toyota [brand=" + brand + ", model=" + model + "]";
    }

}
