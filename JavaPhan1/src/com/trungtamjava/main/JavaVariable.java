package com.trungtamjava.main;

//https://www.youtube.com/watch?v=8aBdtlH9YD4&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=9&t=140s
//https://www.youtube.com/watch?v=bauvKnc4b2M&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=10&t=22s
public class JavaVariable {
	public static void main(String[] args) {
		// SO NGUYEN
		int x = 10;
		int y = 20;// int : 4byte
		int tong = x + y;
		System.out.println(tong);

		long k = 10000000000L;

		long tong2So = k + y;
		System.out.println(tong2So);

		byte b = 127;//
		short s = 1000;
		s = 500;

		int thuong = s / b;
		System.out.println(thuong);
		int phanDu = s % b;
		System.out.println(phanDu);

		// SO THUC
		float f = 4.6F;/// 4 byte;
		double d = 5000.6;// 8byte

		double tongSo = d + s;
		// ep ve double
		double thuongSo = s / (double) b;
		System.out.println(thuongSo);

		/// KY TU
		char c = 'C';// ASCII
		int keyCode = (int) c;
		System.out.println(keyCode);
		int key = 128;
		System.out.println((char) key);
		/// Boolean
		boolean check = true;
		check = false;
		/// String
		String str1 = "Hello";
		String str2 = "Java";
		String str = str1 + str2;

		System.out.println(str);
		System.out.println("Tong: " + tong2So);
	}
}
