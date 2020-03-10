package com.trungtamjava.main;

import com.trungtamjava.model.BaoVe;
import com.trungtamjava.model.KeToan;
import com.trungtamjava.model.LeTan;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MainTinhLuong {

	public static void main(String[] args) {
		int luongBaoVe = 60;
		int luongKeToan = 70;
		int luongLeTan = 56;
		
		// Decimal Format
		Locale locale = new Locale("<em>vi</em>", "VN");
		String pattern = "###,###.###";

		DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
		decimalFormat.applyPattern(pattern);
		String formatBv = decimalFormat.format(BaoVe.tinhLuong(luongBaoVe));
		String formatKt = decimalFormat.format(KeToan.tinhLuong(luongKeToan));
		String formatLt = decimalFormat.format(LeTan.tinhLuong(luongLeTan));

		

		// Hien Thi
		System.out.println("Lương Bảo Vệ là :" + formatBv + " VND");
		System.out.println("Lương Kế Toán là :" + formatKt + " VND");
		System.out.println("Lương Lễ Tân là  :" + formatLt + " VND");
	}

}
