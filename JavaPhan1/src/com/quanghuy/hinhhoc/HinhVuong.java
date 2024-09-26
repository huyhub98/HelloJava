package com.trungtamjava.hinhhoc;

//https://www.youtube.com/watch?v=jIP3D08kqXA&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=14&t=1s
public class HinhVuong {
	
	public static int chuVi(int a) {
		int cv = a * 4;
		return cv;
	}
	
	///OVERLOAD HAM:
	public static double chuVi(double a) {
		double cv = a * 4;
		return cv;
	}
	
	public static double chuVi(long a) {
		double cv = a * 4;
		return cv;
	}
	
	public static int dienTich(int a) {
		return a * a;
	}
}
