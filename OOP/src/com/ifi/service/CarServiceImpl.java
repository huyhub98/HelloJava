package com.ifi.service;

import java.util.Scanner;

import com.ifi.model.Car;
import com.ifi.model.Honda;

public class CarServiceImpl implements CarService {
	// nhập thông tin xe
	@Override
	public void input(Car car) {
		//Car car = new Car();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("nhập vào id xe:");
		car.setId(sc.nextInt());
		System.out.println("nhập vào tên xe:");
		car.setName(sc2.nextLine());
		System.out.println("nhập vào giá xe:");
		car.setPrice(sc.nextLong());

	}

	// hiển thị thông tin xe
	@Override
	public void info(Car car) {
		//Car car = new Car();
		System.out.println("id xe: " + car.getId());
		System.out.println("tên xe: " + car.getName());
		System.out.println("giá xe: " + car.getPrice());
	}

}
