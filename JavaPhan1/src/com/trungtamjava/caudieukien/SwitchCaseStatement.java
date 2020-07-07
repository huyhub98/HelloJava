package com.trungtamjava.caudieukien;

import java.util.Scanner;

//https://www.youtube.com/watch?v=Y4h9xkmEQVI&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=19&t=1s
public class SwitchCaseStatement {
	public static void main(String[] args) {
		selectAnswer();
	}

	public static void selectAnswer() {
		// MENU
		System.out.println("CHON: ");
		System.out.println("1.Cafe");
		System.out.println("2.Tea");
		System.out.println("3.Beer");

		Scanner sc = new Scanner(System.in);
		System.out.println("Chon mon:");
		int select = sc.nextInt();

		if (select == 1) {
			System.out.println("Cafe");
		} else if (select == 2) {
			System.out.println("Tea");
		} else if (select == 3) {
			System.out.println("Beer");
		} else {
			System.out.println("Vui long chon lai");
		}

		//// switch case
		switch (select) {
			case 1:
				System.out.println("Cafe");
				break;
			case 2:
				System.out.println("Tea");
				break;
			case 3:
				System.out.println("Beer");
				break;
			default:
				System.out.println("Vui long chon lai");
		}
	}
}
