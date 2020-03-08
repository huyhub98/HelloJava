package com.trungtamjava.main;

import com.trungtamjava.hinhhoc.HinhChuNhat;
import com.trungtamjava.hinhhoc.HinhTamGiac;
import com.trungtamjava.hinhhoc.HinhTron;
import com.trungtamjava.hinhhoc.HinhVuong;

public class MainHinhHoc {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		int cvTamGiac = HinhTamGiac.chuVi(x, y, z);
		int dtTamGiac = HinhTamGiac.dienTich(x, y, z);
		int cvHinhVuong = HinhVuong.chuVi(x);
		int dtHinhVuong = HinhVuong.dienTich(x);
		double cvHinhTron = HinhTron.chuVi(x);
		double dtHinhTron = HinhTron.dienTich(x);
		int cvHinhChuNhat = HinhChuNhat.chuVi(x, y);
		int dtHinhChuNhat = HinhChuNhat.dienTich(x, y);

		// Hien Thi
		// Tam Giac
		System.out.println("Chu Vi Tam Giac la :" + cvTamGiac);
		System.out.println("Dien Tich Tam Giac la :" + dtTamGiac);

		// Hinh Vuong
		System.out.println("Chu Vi Hinh Vuong la :" + cvHinhVuong);
		System.out.println("Dien Tich Hinh Vuong la :" + dtHinhVuong);
		
		// Hinh TRon
		System.out.println("Chu Vi Hinh Tron la :" + cvHinhTron);
		System.out.println("Dien Tich Hinh Tron la :" + dtHinhTron);
		
		// Hinh Chu Nhat
		System.out.println("Chu Vi Hinh Chu Nhat la :" + cvHinhChuNhat);
		System.out.println("Dien Tich Hinh Chu Nhat la :" + dtHinhChuNhat);

	}

}
