package com.ifi.service;

import java.util.Scanner;

import com.ifi.model.Car;
import com.ifi.model.Vinfast;

public class VinfastServiceImpl extends CarServiceImpl {

	Vinfast vin = new Vinfast();
	@Override
	public void input(Car car) {
		super.input(car);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào mẫu xe: ");
		vin.setModel(sc.nextLine());
	}

	@Override
	public void info(Car car) {
		super.info(car);
		
		System.out.println("Hãng xe: " + vin.getBrand());
		System.out.println("Mẫu xe: " + vin.getModel());
	}

}
