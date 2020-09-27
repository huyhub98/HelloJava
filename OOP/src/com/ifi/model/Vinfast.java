package com.ifi.model;

import java.util.Scanner;

import com.ifi.utils.CarConst;

public class Vinfast extends Car {
	private String brand = CarConst.VINFAST;
	private String model;

	
	public Vinfast() {
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

//	@Override
//	public void input() {
//		// TODO Auto-generated method stub
//		super.input();
//		System.out.println("Nhập vào mẫu xe: ");
//		model = new Scanner(System.in).nextLine();
//	}
//
//	@Override
//	public void info() {
//		// TODO Auto-generated method stub
//		super.info();
//		System.out.println("Hãng xe: " + this.brand);
//		System.out.println("Mẫu xe: " + this.model);
//	}
}
