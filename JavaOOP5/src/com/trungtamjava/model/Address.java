package com.trungtamjava.model;

import java.util.Scanner;

public class Address {
	private String no;
	private String street;
	private String district;
	private String city;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void input() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap so nha:");
		this.no = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap ten duong:");
		this.street = sc2.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Nhap quan/huyen:");
		this.district = sc3.nextLine();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Nhap TP:");
		this.city = sc4.nextLine();
	}
	
	public void info() {
		System.out.println("No " + this.no);
		System.out.println("street " + this.street);
		System.out.println("district " + this.district);
		System.out.println("city " + this.city);
		System.out.println("---------");
	}

}
