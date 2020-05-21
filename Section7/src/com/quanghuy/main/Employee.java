package com.quanghuy.main;

import java.util.Scanner;

import com.quanghuy.company.Developer;
import com.quanghuy.company.Leader;
import com.quanghuy.company.Tester;

public class Employee {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		while (true) {
			System.out.println("---MENU---");
			System.out.println("1.Nhap thong tin cho Developer");
			System.out.println("2.Nhap thong tin cho Tester");
			System.out.println("3.Nhap thong tin cho Leader");
			System.out.println("Nhap vao lua chon: ");
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
				System.out.println("Moi nhap lai");
			}
		}
	}

	public static void developer() {
		System.out.println("Nhap vao so phan tu cho dev:");
		int d = new Scanner(System.in).nextInt();
		Developer[] dev = new Developer[d];
		for (int i = 0; i < dev.length; i++) {
			System.out.println("Nhap thong tin cho dev thu " + (i + 1));
			dev[i] = new Developer();
			dev[i].input();
		}
		for (Developer d1 : dev) {
			System.out.println("Thong tin cac dev vua nhap:");
			d1.info();
		}
		System.out.println("thong tin dev dung ngon ngu java:");
		for (int i = 0; i < dev.length; i++) {
			if (dev[i].getProgramLanguage().equalsIgnoreCase("java")) {
				dev[i].info();
			}
		}
	}

	public static void tester() {
		System.out.println("Nhap vao so phan tu cho tester:");
		int t = new Scanner(System.in).nextInt();
		Tester[] test = new Tester[t];
		System.out.println("Nhap thong tin cho cac tester:");
		for (int j = 0; j < test.length; j++) {
			System.out.println("Nhap thong tin cho tester thu " + (j + 1));
			test[j] = new Tester();
			test[j].input();
		}
		for (Tester t1 : test) {
			System.out.println("Thong tin cac tester vua nhap:");
			t1.info();
		}
	}

	public static void leader() {
		System.out.println("Nhap vao so phan tu cho leader:");
		int l = new Scanner(System.in).nextInt();
		Leader[] lead = new Leader[l];
		System.out.println("Nhap thong tin cho cac leader:");
		for (int k = 0; k < lead.length; k++) {
			System.out.println("Nhap thong tin cho leader thu " + (k + 1));
			lead[k] = new Leader();
			lead[k].input();
		}
		for (Leader l1 : lead) {
			System.out.println("Thong tin cac leader vua nhap:");
			l1.info();
		}
		System.out.println("thong tin Leader co teamsize tren 10 nguoi:");
		for (int i = 0; i < lead.length; i++) {
			if (lead[i].getTeamSize() > 10) {
				lead[i].info();
				System.out.println("Luong co ban cua leader " + lead[i].getName() + " la: " + lead[i].bonus() + " VND");
			} else {
				System.out.println("Luong co ban cua leader " + lead[i].getName() + " la: " + lead[i].bonus() + " VND");
			}
		}
	}
}
