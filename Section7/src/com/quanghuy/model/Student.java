package com.quanghuy.model;

import java.util.Scanner;

public class Student extends Person{
	String major;

	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhập vào ngành học:");
		major = new Scanner(System.in).nextLine();
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("Ngành: "+this.major);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}
