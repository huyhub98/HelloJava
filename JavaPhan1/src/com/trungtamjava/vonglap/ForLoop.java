package com.trungtamjava.vonglap;

import java.util.Scanner;

//https://www.youtube.com/watch?v=Odw_3PuGQNw&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=25&t=1s
//https://www.youtube.com/watch?v=h1rBCFbM0R8&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=26&t=0s
//https://www.youtube.com/watch?v=FlyAW6l9seE&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=29&t=15s
public class ForLoop {

	public static void main(String[] args) {
		forExam();
	}

	public static void forExam() {
		// vong lap
		// dkien dung se chay code ben trong

		for (int i = 0; i < 10; i++) {
			System.out.println("Xin chao");
			System.out.println(i);
		}

		for (int i = 9; i >= 0; i--) {
			System.out.println("Xin chao");
			System.out.println(i);
		}
	}

	public static void tong() {
		int tong = 0;

		for (int i = 0; i < 10; i++) {// dieu kien lap lai
			tong += i;// tong = tong + i
		}

		System.out.println("Tong: " + tong);
	}

	// tinh gia thua
	public static void giaiThua(int n) {
		if (n > 0) {
			// n! = 1*2*...*n
			int tich = 1;

			for (int i = 1; i <= n; i++) {
				tich *= i;
			}
			System.out.println("GT: " + tich);
		} else {
			System.out.println("n <= 0");
		}
	}

	//https://www.youtube.com/watch?v=eFmtLMcCadY&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=32&t=0s
	public static void mang() {
		int[] numbers = new int[3];
		// numbers[0] = 10;
		// numbers[1] = 10;

		// .length: tra ve sl phan tu
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Nhap vao so " + i);
			Scanner sc = new Scanner(System.in);
			numbers[i] = sc.nextInt();
		}

		/// IN RA MAN HINH CAC SO TRONG MANG

		for (int k = 0; k < numbers.length; k++) {
			System.out.println(numbers[k]);
		}
		/// TONG
		int tong = 0;

		for (int j = 0; j < numbers.length; j++) {// dieu kien lap lai
			tong += numbers[j];
		}
		System.out.println("Tong: " + tong);

		// TIM MIN
		int min = numbers[0];
		for (int j = 0; j < numbers.length; j++) {// dieu kien lap lai
			if (min > numbers[j]) {
				min = numbers[j];// gan lai
			}
		}
		System.out.println("MIN: " + min);
	}
}
