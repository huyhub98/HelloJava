package com.quanghuy.model;

import java.util.Scanner;

public class School {
	private String schoolName;
	private int id;
	private String address;

	public School() {
		super();
	}

	public School(int id) {
		super();
		this.id = id;
	}

	public School(String schoolName, String address) {
		super();
		this.schoolName = schoolName;
		this.address = address;
	}

	public School(int id, String schoolName, String address) {
		super();
		this.schoolName = schoolName;
		this.id = id;
		this.address = address;
	}

	public void input() {
		System.out.println("Nhập tên trường: ");
		this.schoolName = new Scanner(System.in).nextLine();
		System.out.println("Nhập vào id: ");
		this.id = new Scanner(System.in).nextInt();
		System.out.println("Nhập vào địa chỉ: ");
		this.address = new Scanner(System.in).nextLine();
	}

	public void info() {
		System.out.println("Trường: "+this.schoolName);
		System.out.println("ID: "+this.id);
		System.out.println("Địa Chỉ: "+this.address);
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
