package com.quanghuy.main;

import com.quanghuy.model.Chair;
import com.quanghuy.model.Laptop;

public class MainBai1 {

	public static void main(String[] args) {
		Chair chair = new Chair(0, "Ghế ăn", "Đỏ");
		chair.chairInfo();

		System.out.println("\n");
		Chair chair1 = new Chair();
		chair1.setName("Ghế Dài");
		chair1.setColor("Vàng");
		chair1.setPrice(90000);
		chair1.chairInfo();

		System.out.println("\n");
		Laptop asus = new Laptop("GL550", "ASUS", 9000);
		asus.info();

		System.out.println("\n");
		Laptop lenovo = new Laptop();
		lenovo.setName("Thinkpad");
		lenovo.setManufacture("LENOVO");
		lenovo.setPrice(-1);
		lenovo.info();
	}

}
