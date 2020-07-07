package service;

import java.util.Scanner;

import model.Address;

public class AddressServiceImpl implements AddressService{
	
	@Override
	public void input(Address add) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap so duong:");
		add.setStreet(sc1.nextLine());

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap ten pho:");
		add.setCity(sc2.nextLine());
	}
	
	@Override
	public void info(Address add) {
		System.out.println(add.getStreet());
		System.out.println(add.getCity());
	}
}
