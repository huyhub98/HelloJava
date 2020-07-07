package model;

import java.util.Scanner;

public abstract class Vehicle {
	private String name;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void info() {
		System.out.println(name);
		System.out.println(color);
		System.out.println("---------");
	}

	public void input() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		name = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap mau:");
		color = sc2.nextLine();
	}
	
	//HAM ABSTRACT
	//la ham ko co body
	//class con bat buoc fai override
	//mo phong chuc nang se co o 
	// doi tuong con
	public abstract void fuelConsume();
	
	
}
