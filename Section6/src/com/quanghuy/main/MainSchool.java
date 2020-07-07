package com.quanghuy.main;

import java.util.Scanner;

import com.quanghuy.model.School;

public class MainSchool {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số trường: ");
		n = sc.nextInt();
		School[] school = new School[n];
		for (int i = 0; i < school.length; i++) {
			System.out.println("Nhập thông tin cho trường thứ: " + (i + 1));
			school[i] = new School();
			school[i].input();
		}
		for (School s : school) {
			s.info();
		}
		while (true) {
			System.out.println("Mời nhập vào lựa chọn");
			System.out.println("1.Tìm trường");
			System.out.println("2.Exit");
			int select = new Scanner(System.in).nextInt();
			if (select == 1) {
				// Tìm trường
				System.out.println("Nhập vào tên trường: ");
				String name = new Scanner(System.in).nextLine();
				for (int i = 0; i < school.length; i++) {
					if (name.contentEquals(school[i].getSchoolName())) {
						school[i].info();
					}
				}
				break;
			} else if (select == 2) {
				break;
			} else {
				System.out.println("Mời nhập lại");
			}
		}
	}
}