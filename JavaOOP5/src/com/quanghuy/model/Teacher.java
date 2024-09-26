package com.trungtamjava.model;

import java.util.Scanner;

public class Teacher extends Person {
	private String department;

	@Override
	public void input() {
		super.input();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap Co quan:");
		this.department = sc2.nextLine();

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
