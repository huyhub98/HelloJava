package com.quanghuy.model;

import java.util.Scanner;

public class Developer extends Employee {
	String programLanguage;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhập vào ngôn ngữ lập trình đang dùng:");
		this.programLanguage = new Scanner(System.in).nextLine();
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("Ngôn ngữ dùng: " + this.programLanguage);
	}

	public String getProgramLanguage() {
		return programLanguage;
	}

	public void setProgramLanguage(String programLanguage) {
		this.programLanguage = programLanguage;
	}

}
