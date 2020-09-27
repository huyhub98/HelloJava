package com.ifi.service;

import java.util.Scanner;

import com.ifi.model.Car;
import com.ifi.model.Toyota;

public class ToyotaServiceImpl extends CarServiceImpl {

	Toyota toyota = new Toyota();
	@Override
	public void input(Car car) {
		super.input(car);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào mẫu xe: ");
		toyota.setModel(sc.nextLine());
	}

	@Override
	public void info(Car car) {
		super.info(car);
		System.out.println("Hãng xe: " + toyota.getBrand());
		System.out.println("Mẫu xe: " + toyota.getModel());
	}

}
