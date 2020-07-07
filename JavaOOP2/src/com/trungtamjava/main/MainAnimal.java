package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.model.Cat;
import com.trungtamjava.model.Dog;

public class MainAnimal {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1.Dog");
			System.out.println("2.Cat");
			System.out.println("3.Exit");

			System.out.println("Nhap vao lua chon:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			if (n == 1) {
				menuDog();
			} else if (n == 2) {
				// tuong tu tao menuCat
				menuCat();
			}
			if (n == 3) {
				break;
			} else {
				System.out.println("Chon lai");
			}
		}
	}

	public static void menuDog() {
		System.out.println("NHAP DOG");
		/// TAO MANG
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong dog");
		int n = sc.nextInt();

		Dog[] dogs = new Dog[n];
		// 5 bien ben tren chua co doi tuong nao, deu la null

		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();// gan cho 1 doi tuong
			dogs[i].input();
		}
		// info
		for (int i = 0; i < dogs.length; i++) {
			dogs[i].info();
		}
		// FOR EACH - tuong for i = 0 -> n
		for (Dog d : dogs) {
			/// d = dogs[0], dogs[1],....
			d.info();
		}
	}

	public static void menuCat() {

		System.out.println("NHAP Cat");
		/// TAO MANG
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong cat");
		int n = sc.nextInt();

		Cat[] cats = new Cat[n];
		// 5 bien ben tren chua co doi tuong nao, deu la null

		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat();// gan cho 1 doi tuong
			cats[i].input();
		}
		// info
		for (int i = 0; i < cats.length; i++) {
			cats[i].info();
		}
		// FOR EACH - tuong for i = 0 -> n
		for (Cat c : cats) {
			/// d = dogs[0], dogs[1],....
			c.info();
		}
	}
}
