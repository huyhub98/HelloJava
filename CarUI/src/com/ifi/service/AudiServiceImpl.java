package com.ifi.service;

import java.util.Scanner;

import com.ifi.model.Audi;
import com.ifi.model.Car;

public class AudiServiceImpl extends CarServiceImpl {

	@Override
	public void input(Car car) {
		Audi audi = new Audi();
		super.input(car);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào mẫu xe: ");
		audi.setModel(sc.nextLine());
	}

	@Override
	public void info(Car car) {
		Audi audi = new Audi();
		super.info(car);
		System.out.println("Hãng xe: " + audi.getBrand());
		System.out.println("Mẫu xe: " + audi.getModel());
	}

}
