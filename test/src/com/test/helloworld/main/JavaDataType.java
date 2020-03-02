package com.test.helloworld.main;

public class JavaDataType {
	/// kieu du lieu trong java
	public static void main(String[] args) {
		// Kieu So
		// So Nguyen
		int x = 100;
		int y = 900;
		int tong = x + y;
		System.out.println(tong);
		int tich = x * y;
		System.out.println(tich);
		int thuong = y / x;
		System.out.println(thuong);
		int phanDu = y % x;
		System.out.println(phanDu);
		System.out.println(Integer.MAX_VALUE);
		// kieu long : 8 byte

		long k = 10000000000L; // L hoac l;
		long tongLong = k + x;
		System.out.println(tongLong);

		// nho + to = to
		// byte : 1 byte , short : 2 byte

		byte b = 127;
		short c = 6000;

		/// So Thuc
		double d = 56666.999; // 8 byte
		float f = 555.555f; // 4 byte
		double tongSoThuc = d + f;
		System.out.println(tongSoThuc);

		// Ep Kieu Xuong : can than
		int epKieu = (int) d;
		System.out.println(epKieu);

		// Chia so nguyen vs so thuc ( Ep Kieu Len)
		double epKieu2 = 566 / (double) 100;
		System.out.println(epKieu2);

		// character
		char e = 'E';
		int keyCodeOfE = (int) e;
		System.out.println(keyCodeOfE);
		char n = (char) 78;
		System.out.println(n);

		// boolean : true / false
		boolean check = true;

		// String : kieu doi tuong
		String s = "Hello Java";
		String s2 = s + ". Easy";
		String s3 = s + " " + tong;
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
	}
}
