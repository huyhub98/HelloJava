package com.trungtamjava.main;

import com.trungtamjava.model.Product;

public class MainProduct {
	public static void main(String[] args) {
		// tao bang thu cong 2 sp
//		Product product1 = new Product();
//		product1.input();
//		
//		Product product2 = new Product();
//		product2.input();
//		
//		///INFO
//		product1.info();

		System.out.println("NHAP SP");
		/// TAO MANG
		// int[] numbers = new int[5];
		// tao 5 bien products0 -> products4
		Product[] products = new Product[5];
		// 5 bien ben tren chua co doi tuong nao, deu la null

		for (int i = 0; i < products.length; i++) {
			products[i] = new Product();// gan cho 1 doi tuong
			products[i].input();
		}
		// info
		for (int i = 0; i < products.length; i++) {
			products[i].info();
		}

	}
}
