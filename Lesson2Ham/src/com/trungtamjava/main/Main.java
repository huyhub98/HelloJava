package com.trungtamjava.main;

import com.trungtamjava.ham.ThuVienToanHoc;

public class Main {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tong = ThuVienToanHoc.tong2So(x, y);
		int tich = ThuVienToanHoc.tich2So(x, y);
		int thuong = ThuVienToanHoc.thuong2So(x, y);
		int hieu = ThuVienToanHoc.hieu2So(x, y);
		System.out.println("Tong la "+tong);
		System.out.println("Tich la "+tich);
		System.out.println("Thuong la "+thuong);
		System.out.println("Hieu la "+hieu);
	}
}
