package com.trungtamjava.model;

import java.util.Scanner;

public class Dog {
	private String name;
	private int legNo;// tam thoi 1 thuoc tinh khac

	public void input() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		this.setName(sc1.nextLine());
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap so chan:");
		this.legNo = sc2.nextInt();
	}

	public void info() {
		System.out.println("Name " + this.name);
		System.out.println("---------");

		System.out.println("So chan: " + legNo);
	}

	public int getLegNo() {
		return legNo;
	}

	public void setLegNo(int legNo) {
		this.legNo = legNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
