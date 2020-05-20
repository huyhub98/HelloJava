package com.quanghuy.model;

import java.util.Scanner;

public class Person {
	String name;
	int id;
	int age;

	public void input() {
		System.out.println("Nhập vào tên:");
		this.name = new Scanner(System.in).nextLine();
		System.out.println("Nhập vào id:");
		this.id = new Scanner(System.in).nextInt();
		System.out.println("Nhập vào tuổi:");
		this.age = new Scanner(System.in).nextInt();
	}

	public void info() {
		System.out.println("Tên: " + this.name);
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
