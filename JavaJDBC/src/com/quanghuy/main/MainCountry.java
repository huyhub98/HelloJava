package com.quanghuy.main;

import java.util.List;
import java.util.Scanner;

import com.quanghuy.dao.CountryDao;
import com.quanghuy.dao.CountryDaoImpl;
import com.quanghuy.model.Country;

public class MainCountry {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		while (true) {
			System.out.println("MENU");
			System.out.println("1.Tạo");
			System.out.println("2.Sửa");
			System.out.println("3.Xóa");
			System.out.println("4.Tìm theo tên");
			System.out.println("5.Tìm theo id");
			System.out.println("6.Thoát");
			Scanner sc1 = new Scanner(System.in);
			int select = sc1.nextInt();
			if (select == 1) {
				createCountry();
			} else if (select == 2) {
				updateCountry();
			} else if (select == 3) {
				deleteCountry();
			} else if (select == 4) {
				searchByName();
			} else if (select == 5) {
				getById();
			} else if (select == 6) {
				break;
			} else {
				System.out.println("Mời nhập lại menu từ 1-6");
			}
		}
	}

	public static void getById() {
		CountryDao countryDao = new CountryDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập id cần tìm kiếm:");
		int id = sc.nextInt();
		Country country = countryDao.get(id);
		if (country != null) {
			info(country);
		} else {
			System.out.println("Không tìm thấy");
		}
	}

	public static void searchByName() {
		CountryDao countryDao = new CountryDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào từ khóa cần tìm:");
		String name = sc.nextLine();
		List<Country> countries = countryDao.search(name);
		if (countries.isEmpty()) {
			System.out.println("Khong tim thay");
		} else {
			for (Country country : countries) {
				info(country);
				System.out.println("-----------");
			}
		}
	}

	public static void deleteCountry() {
		CountryDao countryDao = new CountryDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập id cần delete:");
		int id = sc.nextInt();
		countryDao.delete(id);
	}

	public static void updateCountry() {
		CountryDao countryDao = new CountryDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập id cần update:");
		int id = sc.nextInt();
		Country country = new Country();
		country.setId(id);
		input(country);
		countryDao.update(country);
	}

	public static void createCountry() {
		Country country = new Country();
		input(country);

		CountryDao countryDao = new CountryDaoImpl();
		countryDao.create(country);
		info(country);
	}

	public static void input(Country country) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhập id:");
		country.setId(sc.nextInt());
		System.out.println("Nhập tên nước:");
		country.setName(sc1.nextLine());

	}

	public static void info(Country country) {
		System.out.println("ID country: "+country.getId());
		System.out.println("tên nước: "+country.getName());
	}
}
