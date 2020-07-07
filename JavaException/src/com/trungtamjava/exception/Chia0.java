package com.trungtamjava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chia0 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		thuong(a, b);
		// input();
		System.out.println("KET THUC");
	}

	public static void thuong(int a, int b) {
		/// XAY RA LOI
		try {
			System.out.println("Thuong");
			System.out.println(a / b);
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println("Loi chia " + b);
			System.out.println(ex);
		}
	}

	public static void input() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhap so");
				int a = sc.nextInt();
				System.out.println(a);

				break;
			} catch (InputMismatchException e) {
				System.out.println(e);
			} catch (ArithmeticException e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				System.out.println("HOAN THANH");
			}
		}
	}
}
