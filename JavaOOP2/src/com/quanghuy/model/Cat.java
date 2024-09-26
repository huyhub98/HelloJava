package com.trungtamjava.model;

import java.util.Scanner;

//is-a
public class Cat {
	private String name;
	private String color;// tam thoi 1 thuoc tinh khac

	public void input() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		this.setName(sc1.nextLine());

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap mau:");
		this.color = sc2.nextLine();
	}

	public void info() {
		System.out.println("Name " + this.name);
		System.out.println("---------");

		System.out.println("color: " + color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
