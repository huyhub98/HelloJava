package com.trungtamjava.model;

import java.util.Scanner;

public class School {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void input() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		this.setName(sc1.nextLine());
	}
	
	public void info() {
		System.out.println("Name " + this.name);
		System.out.println("---------");
	}
}
