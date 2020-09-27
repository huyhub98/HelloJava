package com.ifi.model;

import com.ifi.utils.*;
import java.util.Scanner;

public class Honda extends Car {
	private String brand = CarConst.HONDA;
	private String model;

	public Honda() {
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
