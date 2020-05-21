package com.quanghuy.company;

import java.util.Scanner;

public class Employee {
	private String name;
	private int id;
	private int age;

	public void input() {
		System.out.println("Nhập vào họ tên:");
		this.name = new Scanner(System.in).nextLine();
		System.out.println("Nhập vào id");
		this.id = new Scanner(System.in).nextInt();
		System.out.println("Nhập vào số tuổi");
		this.age = new Scanner(System.in).nextInt();
	}

	public void info() {
		System.out.println("Họ tên: " + this.name);
		System.out.println("ID: " + this.id);
		System.out.println("Tuổi: " + this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}