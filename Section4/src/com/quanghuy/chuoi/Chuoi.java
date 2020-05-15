package com.quanghuy.chuoi;

import java.util.Scanner;

public class Chuoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi bất kỳ: ");
		String string1 = sc.nextLine().toLowerCase();
		System.out.println("Nhập vào chuỗi bất kỳ tiếp theo");
		String string2 = sc.nextLine();
		stringLength(string1);
		compareChuoi(string1, string2);
		count(string1);
		spaceSplit(string1);
	}

	// In ra độ dài của string1
	public static void stringLength(String string1) {
		System.out.println("Độ dài của chuỗi là: " + string1.length());
	}

	// So sánh 2 chuỗi
	public static void compareChuoi(String string1, String string2) {
		if (string1.equalsIgnoreCase(string2)) {
			System.out.println("Hai chuỗi bằng nhau");
		} else {
			System.out.println("Hai chuỗi không bằng nhau");
		}
	}

	// Đếm số kí tự A xuất hiện trong chuỗi
	public static void count(String string1) {
		char kyTu1 = 'a';
		char kyTu2 = 'ạ';
		char kyTu3 = 'á';
		char kyTu4 = 'ã';
		char kyTu5 = 'ả';
		char kyTu6 = 'à';
		int count = 0;
		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i) == kyTu1 || string1.charAt(i) == kyTu2 || string1.charAt(i) == kyTu3
					|| string1.charAt(i) == kyTu4 || string1.charAt(i) == kyTu5 || string1.charAt(i) == kyTu6) {
				count++;
			}
		}
		System.out.println("Chuỗi có " + count + " lần kí tự A xuất hiện trong chuỗi " + string1);
	}

	public static void spaceSplit(String string1) {
		String[] split = string1.split("\\s+");
		System.out.println("Các chuỗi sau khi cắt:");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}
}
