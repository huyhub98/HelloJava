package com.trungtamjava.model;

import java.util.Scanner;

public class Product {
	private int id;
	private String name;

	public void input() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap Id:");
		this.id = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		this.setName(sc2.nextLine());
	}

	public void info() {
		System.out.println("ID " + this.id);
		System.out.println("Name " + this.name);
		System.out.println("---------");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
