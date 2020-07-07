package com.trungtamjava.vonglap;

import java.util.Scanner;

//https://www.youtube.com/watch?v=_7MsCjJybhQ&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=23&t=0s
public class WhileLoop {
	public static void main(String[] args) {
//		whileExam();
//		tong();
//		mang();
		menu();
	}

	public static void whileExam() {
		// vong lap
		// dkien dung se chay code ben trong
		int i = 0;
		while (i < 10) {// dieu kien lap lai
			System.out.println("Xin chao");
			System.out.println(i);
			i++;// i = i + 1; dieu kien ket thuc
		}
	}

	public static void tong() {
		int tong = 0;
		int i = 0;
		while (i < 10) {// dieu kien lap lai
			tong += i;// tong = tong + i
			i++;
		}
		System.out.println("Tong: " + tong);
	}

	// tinh gia thua
	public static void giaiThua(int n) {
		if (n > 0) {
			// n! = 1*2*...*n
			int tich = 1;
			int i = 1;
			while (i <= n) {
				tich *= i;
				i++;// tang len 1
			}
			System.out.println("GT: " + tich);
		} else {
			System.out.println("n <= 0");
		}
	}

	public static void mang() {
		int[] numbers = new int[3];
		// numbers[0] = 10;
		// numbers[1] = 10;
		int i = 0;
		// .length: tra ve sl phan tu
		while (i < numbers.length) {
			System.out.println("Nhap vao so " + i);
			Scanner sc = new Scanner(System.in);
			numbers[i] = sc.nextInt();
			i++;
		}

		/// IN RA MAN HINH CAC SO TRONG MANG
		int k = 0;
		while (k < numbers.length) {
			System.out.println(numbers[k]);
			k++;
		}
		/// TONG
		int tong = 0;
		int j = 0;
		while (j < numbers.length) {// dieu kien lap lai
			tong += numbers[j];
			j++;
		}
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

	//https://www.youtube.com/watch?v=hgBUV2pw2Es&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=21&t=114s
	//https://www.youtube.com/watch?v=WOGHXMpuaLU&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=27&t=10s
	//https://www.youtube.com/watch?v=BAqvZ8VAOTQ&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=31&t=6s
	public static void menu() {
		while (true) {
			System.out.println("1. Cafe");
			System.out.println("2. Thoat");
			
			System.out.println("Nhap vao lua chon");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			
			if (select == 1) {
				System.out.println("Cafe");
			} else if(select == 2) {
				break;//thoat vong lap hien tai cua no
			} else {
				System.out.println("Vui long chon");
			}
		}
	}

}
