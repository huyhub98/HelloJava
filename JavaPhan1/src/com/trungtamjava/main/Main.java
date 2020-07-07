package com.trungtamjava.main;

import com.trungtamjava.ham.ThuVienToanHoc;

public class Main {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		int tong = ThuVienToanHoc.tong(x, y);
		int tich = ThuVienToanHoc.tich(x, y);
		int thuong = ThuVienToanHoc.thuong(x, y);
		int hieu = ThuVienToanHoc.hieu(x, y);
		
		System.out.println("Tong la: " + tong);
		System.out.println("Hieu la: " + hieu);
		System.out.println("Tich la: " + tich);
		System.out.println("Thuong la: " + thuong);
	} 
}
