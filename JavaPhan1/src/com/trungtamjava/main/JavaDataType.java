package com.trungtamjava.main;

public class JavaDataType {
	/// kieu du lieu trong java
	public static void main(String[] args) {
		// KIEU SO:
		// SO NGUYEN
		int x = 10;// kieu_du_lieu ten_bien = gia_tri
		int y = 22;
		int tong = x + y;
		System.out.println(tong);

		int tich = x * y;
		// slash
		int thuong = y / x;// dc 2
		int phanDu = y % x;// du 2

		System.out.println(phanDu);
		// int: 4 byte = 8* 4 = 32 bit; 2^32-1;
		System.out.println(Integer.MAX_VALUE);
		// kieu long: 8 byte
		long k = 10000000000L;// l
		long tongLong = k + x;
		System.out.println(tongLong);
		// nho + to = to
		// byte: 1 byte , short: 2byte
		byte b = 127;
		short c = 6000;

		///// SO THUC
		double d = 56666.444; // 8byte
		float f = 555.555f; // 4byte
		double tongSoThuc = d + f;
		System.out.println(tongSoThuc);

		// ep kieu xuong: can than
		int epKieu = (int) d;
		System.out.println(epKieu);
		//ep kieu len
		double epKieu2 = 566 / (double) 100;
		System.out.println(epKieu2);
		
		//character: ASCII
		char  e = 'E';
		int keyCodeOfE = (int) e;
		System.out.println(keyCodeOfE);
		char n = (char) 78;
		System.out.println(n);
		
		///boolean: true / false
		boolean check = true;
		//khong dc khai bao lai
		//co the gan
		check = false;
		
		//String: kieu doi tuong
		String s = "Hello Java";
		String s2 = s + ". Easy!";
		System.out.println(s2);
		//cong lai deu ra string
		String s3 = s + ". tong la: " +tong;
		System.out.println(s3);
		
		
	}
}
