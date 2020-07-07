package com.quanghuy.model;

import java.util.Scanner;

public class Teacher extends Person {
	String workplace;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhập vào tên trường nơi làm:");
		this.workplace = new Scanner(System.in).nextLine();
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("Làm tại trường: "+this.workplace);
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

}
