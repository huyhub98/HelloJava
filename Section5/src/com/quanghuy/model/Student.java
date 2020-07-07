package com.quanghuy.model;

import java.util.Scanner;

public class Student {
	private long id;
	private String name;
	private String address;
	private String major;

	public Student() {
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, String address, String major) {
		super();
		this.name = name;
		this.address = address;
		this.major = major;
	}

	public Student(String name, String address, String major, long id) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.major = major;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void input() {
		System.out.println("Nhập vào tên sinh viên: ");
		this.name = new Scanner(System.in).nextLine();
		System.out.println("Nhập vào địa chỉ sinh viên: ");
		this.address = new Scanner(System.in).nextLine();
		System.out.println("Nhập vào ngành học: ");
		this.major = new Scanner(System.in).nextLine();
		System.out.println("Nhập vào id sinh viên: ");
		this.id = new Scanner(System.in).nextInt();
	}

	public void info() {
		System.out.println("Họ tên sinh viên: " + this.getName());
		System.out.println("Địa chỉ: " + this.getAddress());
		System.out.println("Ngành học: " + this.getMajor());
		System.out.println("Mã sinh viên: " + this.getId());
	}

}
