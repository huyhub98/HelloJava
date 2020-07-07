package com.trungtamjava.caudieukien;

import java.util.Scanner;

//https://www.youtube.com/watch?v=ioZQZ6k1d8s&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=16&t=2s
//https://www.youtube.com/watch?v=2Hhr4MYOC8c&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=17&t=23s
public class IfElseStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so");
		int a = sc.nextInt();

		checkNumber(a);
		checkSoChiaHet(a);
		//ctr + shift + f
		///? : 
		String s = "";
		if (a > 0) {
			s = "Y";
		} else {
			s = "N";
		}
		//tuong duong
		//https://www.youtube.com/watch?v=A0P0UQX1Jac&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=20&t=0s
		s = (a > 0) ? "Y" : "N";
		System.out.println();
	}
	
	public static void checkSoChiaHet(int a) {
		if (a % 2 == 0) {
			System.out.println("Chia het 2");
		} else {
			System.out.println("Ko Chia het 2");
		}
		
		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println("Chia het 2 va 3");
		} else {
			System.out.println("Ko dong thoi Chia het 2 va 3");
		}
	}

	// ham check so am duong
	public static void checkNumber(int a) {
		boolean check = (a > 0);

		if (check) {
			System.out.println("So duong");
		} else if (a < 0) {
			System.out.println("So am");
		} else {
			System.out.println("So 0");
		}

		if (a >= 0) {
			System.out.println(">=0");
		}

		if (a != 0) {
			System.out.println("Khac 0");
		}

		if (a < 0 || a > 0) {
			System.out.println("a != 0");
		}

		if (a < 5 && a >= 0) {
			System.out.println("a != 0");
		}

		if (!(a < 5)) {
			System.out.println("a >= 5");
		}
	}
}
