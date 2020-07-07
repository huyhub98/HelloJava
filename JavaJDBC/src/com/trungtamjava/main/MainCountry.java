package com.trungtamjava.main;

import java.util.List;
import java.util.Scanner;

import com.trungtamjava.dao.CountryDao;
import com.trungtamjava.dao.CountryDaoImpl;
import com.trungtamjava.model.Country;

public class MainCountry {
	public static void main(String[] args) {
		/// CHIA NHO THANH CAC HAM DE GOI TRONG
		// MAIN DE TIEN SU DUNG
		// TAO MOI
		menu();
	}

	public static void menu() {
		while (true) {
			System.out.println("1.Tao");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Get");
			System.out.println("5.Search by name");
			System.out.println("6.Thoat");

			Scanner sc = new Scanner(System.in);
			System.out.println("Chon?");
			int c = sc.nextInt();
			if (c == 1) {
				createCountry();
			} else if (c == 2) {
				updateCountry();
			} else if (c == 3) {
				deleteCountry();
			} else if (c == 4) {
				getById();
			} else if (c == 5) {
				searchByName();
			} else if (c == 6) {
				break;
			} else {
				System.out.println("Nhap tu 1 - 6");
			}
		}
	}

	public static void searchByName() {
		CountryDao countryDao = new CountryDaoImpl();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap tu khoa can tim:");
		String name = sc1.nextLine();
		//
		List<Country> cars = countryDao.search(name);
		if (cars.isEmpty()) {
			System.out.println("Khong tim thay");
		} else {
			for (Country country : cars) {
				info(country);
				System.out.println("-----------");
			}
		}
	}

	public static void getById() {
		CountryDao countryDao = new CountryDaoImpl();
		/// DELETE
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap id can tim:");
		int id = sc1.nextInt();
		//
		Country country = countryDao.get(id);
		if (country != null) {
			info(country);
		} else {
			System.out.println("Khong tim thay");
		}
	}

	public static void updateCountry() {
		CountryDao countryDao = new CountryDaoImpl();
		/// DELETE
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap id can update:");
		int id = sc1.nextInt();
		//
		Country country = new Country();
		country.setId(id);// id can update
		input(country);// nhap du lieu moi

		countryDao.update(country);
	}

	public static void deleteCountry() {
		CountryDao countryDao = new CountryDaoImpl();
		/// DELETE
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap id can xoa:");
		int id = sc1.nextInt();
		//
		countryDao.delete(id);
	}

	public static void createCountry() {
		Country country = new Country();
		input(country);

		// TAO MOI
		// da hinh
		CountryDao countryDao = new CountryDaoImpl();
		countryDao.create(country);
		System.out.println("Thanh cong!");
		info(country);
	}

	public static void input(Country country) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		country.setName(sc1.nextLine());

	}

	public static void info(Country country) {
		System.out.println("Id: " + country.getId());
		System.out.println("Name: " + country.getName());

	}
}
