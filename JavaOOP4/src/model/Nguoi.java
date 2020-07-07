package model;

import java.util.Scanner;

public class Nguoi {
	private int age;
	private String name;
	private ChuyenKhoa khoa;

	public ChuyenKhoa getKhoa() {
		return khoa;
	}

	public void setKhoa(ChuyenKhoa khoa) {
		this.khoa = khoa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void info() {
		System.out.println(this.getName());
		System.out.println(age);
	}

	public void input() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		this.setName(sc1.nextLine());

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap tuoi:");
		this.setAge(sc2.nextInt());

	}

}
