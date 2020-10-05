package com.ifi.model;

import java.io.Serializable;
import java.util.Scanner;

import com.ifi.utils.CarConst;
import com.ifi.utils.CarEnum;

public class Mercedez extends Car implements Serializable {
    private static final long serialVersionUID = 4705614270188471447L;
    private String brand = CarEnum.MERCEDEZ.getBrand();
    private String model;

    public Mercedez() {
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
        return "Mercedez [brand=" + brand + ", model=" + model + "]";
    }

}
