package com.trungtamjava.model;

import java.util.Scanner;

public abstract class Person {
	private int id;
	private String name;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public void input() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap Id:");
		this.setId(sc2.nextInt());

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		this.setName(sc1.nextLine());
	}
	
	public void info() {
		System.out.println("Id " + this.id);
		System.out.println("Name " + this.name);
		System.out.println("---------");
	}
	
}
