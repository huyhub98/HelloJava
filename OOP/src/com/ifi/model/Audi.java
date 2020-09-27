package com.ifi.model;

import java.util.Scanner;

import com.ifi.utils.CarConst;

public class Audi extends Car {
	private String brand = CarConst.AUDI;
	private String model;

	public Audi() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

}
