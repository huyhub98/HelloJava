package com.quanghuy.main;

import java.util.Scanner;

import com.quanghuy.company.Developer;
import com.quanghuy.company.Leader;
import com.quanghuy.company.Tester;

public class MainEmployee {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		while (true) {
			System.out.println("---MENU---");
			System.out.println("1.Nhập thông tin cho Developer");
			System.out.println("2.Nhập thông tin cho Tester");
			System.out.println("3.Nhập thông tin cho Leader");
			System.out.println("Nhập vào lựa chọn: ");
			int select = new Scanner(System.in).nextInt();
			if (select == 1) {
				developer();
				break;
			} else if (select == 2) {
				tester();
				break;
			} else if (select == 3) {
				leader();
				break;
			} else {
				System.out.println("Mời nhập lại");
			}
		}
	}

	public static void developer() {
		System.out.println("Nhập số phần tử cho dev:");
		int d = new Scanner(System.in).nextInt();
		Developer[] dev = new Developer[d];
		for (int i = 0; i < dev.length; i++) {
			System.out.println("Nhập thông tin cho dev thứ " + (i + 1));
			dev[i] = new Developer();
			dev[i].input();
		}
		for (Developer d1 : dev) {
			System.out.println("Thông tin các dev vừa nhập:");
			d1.info();
		}
		System.out.println("Thông tin dev dùng ngôn ngữ java:");
		for (int i = 0; i < dev.length; i++) {
			if (dev[i].getProgramLanguage().equalsIgnoreCase("java")) {
				dev[i].info();
			}
		}
	}

	public static void tester() {
		System.out.println("Nhập số phần tử cho tester:");
		int t = new Scanner(System.in).nextInt();
		Tester[] test = new Tester[t];
		System.out.println("Nhập thông tin cho các tester:");
		for (int j = 0; j < test.length; j++) {
			System.out.println("Nhập thông tin cho tester thứ " + (j + 1));
			test[j] = new Tester();
			test[j].input();
		}
		for (Tester t1 : test) {
			System.out.println("Thông tin các tester vừa nhập:");
			t1.info();
		}
	}

	public static void leader() {
		System.out.println("Nhập vào số phần tử cho leader:");
		int l = new Scanner(System.in).nextInt();
		Leader[] lead = new Leader[l];
		System.out.println("Nhập thông tin cho các leader:");
		for (int k = 0; k < lead.length; k++) {
			System.out.println("Nhập thông tin cho leader thứ " + (k + 1));
			lead[k] = new Leader();
			lead[k].input();
		}
		for (Leader l1 : lead) {
			System.out.println("Thông tin các leader vừa nhập:");
			l1.info();
		}
		System.out.println("Thông tin leader có teamsize trên 10 người:");
		for (int i = 0; i < lead.length; i++) {
			if (lead[i].getTeamSize() > 10) {
				lead[i].info();
				System.out.println("Lương cơ bản của leader " + lead[i].getName() + " là: " + lead[i].bonus() + " VND");
			} else {
				System.out.println("Lương cơ bản của leader " + lead[i].getName() + " là: " + lead[i].bonus() + " VND");
			}
		}
	}
}