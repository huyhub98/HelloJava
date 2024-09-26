package com.trungtamjava.ham;


//https://www.youtube.com/watch?v=qAHpfyXFc3I&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=11&t=10s
public class Method {
	public static void main(String[] args) {
		tong(1, 2);// a = 1, b = 2
		tong(5, 10);// a = 5, b = 10

		int t = tong(100, 200);/// 300
		System.out.println(t);

		hieu(t, 5);
	}

	/// KHAI BAO, DINH NGHIA HAM
	public static int tong(int a, int b) {
//		int a = 10;
//		int b = 5;
		System.out.println(a + b);
		return a + b;
	}
	
	//OVERLOAD
	public static int tong(int a, int b, int c) {
		return a + b + c;
	}

	public static void hieu(long a, int b) {
//		int a = 10;
//		int b = 5;
		System.out.println(a - b);
	}

}
