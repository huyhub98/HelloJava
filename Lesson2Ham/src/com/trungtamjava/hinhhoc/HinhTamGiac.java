package com.trungtamjava.hinhhoc;

public class HinhTamGiac {
	public static int chuVi(int x, int y, int z) {
		return x + y + z;
	}

	public static int dienTich(int x, int y, int z) {
		int chuVi = x + y + z;
		return (int) Math.sqrt(chuVi * (chuVi - x) * (chuVi - y) * (chuVi - z));
	}
}
