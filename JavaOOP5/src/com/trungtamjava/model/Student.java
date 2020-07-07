package com.trungtamjava.model;

import java.util.Scanner;

public class Student extends Person {
	private int score;// diem
	private School school;

	@Override
	public void input() {
		super.input();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap Diem:");
		this.score = sc2.nextInt();

	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}
