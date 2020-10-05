package com.ifi.model;

import com.ifi.utils.*;



import java.io.Serializable;
import java.util.Scanner;


public class Honda extends Car implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String brand = CarEnum.HONDA.getBrand();
    private String model;

    public Honda() {
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
        return "Honda [brand=" + brand + ", model=" + model + "]";
    }

}
