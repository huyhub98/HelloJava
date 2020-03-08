package com.trungtamjava.main;

import com.trungtamjava.model.BaoVe;
import com.trungtamjava.model.KeToan;
import com.trungtamjava.model.LeTan;

public class MainTinhLuong {

	public static void main(String[] args) {
		int luongBaoVe = 60;
		int luongKeToan = 70;
		int luongLeTan = 56;
		
		//Hien Thi
		System.out.println("Luong Bao Ve la :"+BaoVe.tinhLuong(luongBaoVe)+" VND");
		System.out.println("Luong Ke Toan la :"+KeToan.tinhLuong(luongKeToan)+" VND");
		System.out.println("Luong Le Tan la :"+LeTan.tinhLuong(luongLeTan)+" VND");

	}

}
