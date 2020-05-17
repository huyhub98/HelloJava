package com.quanghuy.model;

import java.util.Scanner;

public class CourseScore {
	public String name;
	public int id;
	public int score;

	public void input() {
		System.out.println("Nhập vào Họ Tên:");
		name = new Scanner(System.in).nextLine();
		System.out.println("Nhập vào điểm:");
		score = new Scanner(System.in).nextInt();
		System.out.println("Nhập vào id:");
		id = new Scanner(System.in).nextInt();
	}

	public void info() {
		System.out.println("Họ tên: " + name);
		System.out.println("Điểm: " + score);
		System.out.println("ID: " + id);
	}

	public void condition() {
		if (score < 5) {
			System.out.println("Yếu");
		} else if (score >= 5 && score < 7) {
			System.out.println("Trung bình");
		} else if (score >= 8 && score < 9) {
			System.out.println("Giỏi");
		} else if (score >= 9) {
			System.out.println("Xuất xắc");
		} else {
			System.out.println("Mời nhập lại");
		}
	}
}
