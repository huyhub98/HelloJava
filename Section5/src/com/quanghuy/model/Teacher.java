package com.quanghuy.model;

import java.util.Scanner;

public class Teacher {
	int id;
	String name;
	String address;
	String facility;

	public void input() {
		System.out.println("Nhập vào tên giáo viên: ");
		name = new Scanner(System.in).nextLine();
		System.out.println("Nhập vào địa chỉ giáo viên: ");
		address = new Scanner(System.in).nextLine();
		System.out.println("Nhập vào cơ sở của giáo viên: ");
		facility = new Scanner(System.in).nextLine();
		System.out.println("Nhập vào id giáo viên: ");
		id = new Scanner(System.in).nextInt();
	}

	public void info() {
		System.out.println("Tên giáo viên: " + name);
		System.out.println("Địa chỉ: " + address);
		System.out.println("Cơ sở: " + facility);
		System.out.println("id: " + id);
	}
}
