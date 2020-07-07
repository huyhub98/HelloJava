package com.trungtamjava.vonglap;

import java.util.Scanner;

//https://www.youtube.com/watch?v=2mmv7naSvk0&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=24&t=0s
public class DoWhileLoop {
	public static void main(String[] args) {
		menu();
	}

	public static void doWhileExam() {
		// vong lap
		// dkien dung se chay code ben trong
		int i = 0;
		do {// dieu kien lap lai
			System.out.println("Xin chao");
			System.out.println(i);
			i++;// i = i + 1; dieu kien ket thuc
		} while (i < 10);
	}

	public static void tong() {
		int tong = 0;
		int i = 0;
		do {// dieu kien lap lai
			tong += i;// tong = tong + i
			i++;
		} while (i < 10);

		System.out.println("Tong: " + tong);
	}

	// tinh gia thua
	public static void giaiThua(int n) {
		if (n > 0) {
			// n! = 1*2*...*n
			int tich = 1;
			int i = 1;
			do {
				tich *= i;
				i++;// tang len 1
			} while (i <= n);
			System.out.println("GT: " + tich);
		} else {
			System.out.println("n <= 0");
		}
	}

	public static void menu() {
		int select;
		do {
			System.out.println("1. Cafe");
			System.out.println("2. Thoat");

			System.out.println("Nhap vao lua chon");
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();

			if (select == 1) {
				System.out.println("Cafe");
				break;
			} else if (select == 2) {
				break;// thoat vong lap hien tai cua no
			} else {
				System.out.println("Vui long chon");
			}
		} while (true);

	}

	public static void mang() {
		int[] numbers = new int[3];
		// numbers[0] = 10;
		// numbers[1] = 10;
		int i = 0;
		// .length: tra ve sl phan tu
		do {
			System.out.println("Nhap vao so " + i);
			Scanner sc = new Scanner(System.in);
			numbers[i] = sc.nextInt();
			i++;
		} while (i < numbers.length);

		/// IN RA MAN HINH CAC SO TRONG MANG
		int k = 0;
		do {
			System.out.println(numbers[k]);
			k++;
		} while (k < numbers.length);
		/// TONG
		int tong = 0;
		int j = 0;
		do {// dieu kien lap lai
			tong += numbers[j];
			j++;
		} while (j < numbers.length);

		System.out.println("Tong: " + tong);

		// TIM MIN
		int min = numbers[0];
		j = 0;// reset ve 0
		while (j < numbers.length) {
			if (min > numbers[j]) {
				min = numbers[j];// gan lai
			}
			j++;
		}
		System.out.println("MIN: " + min);
	}
}
