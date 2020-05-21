package com.quanghuy.company;

import java.util.Scanner;

public class Tester extends Employee{
	private String testTools;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhap vao cong cu Test:");
		this.testTools = new Scanner(System.in).nextLine();
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("Cong cu test: "+this.testTools);
	}

	public String getTestTools() {
		return testTools;
	}

	public void setTestTools(String testTools) {
		this.testTools = testTools;
	}
	
}
