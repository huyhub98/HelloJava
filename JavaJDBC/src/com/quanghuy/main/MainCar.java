package com.trungtamjava.main;

import java.util.List;
import java.util.Scanner;

import com.trungtamjava.dao.CarDao;
import com.trungtamjava.dao.CarDaoImpl;
import com.trungtamjava.model.Car;
import com.trungtamjava.model.Country;

public class MainCar {
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
			System.out.println("6.Search by price");
			System.out.println("7.Search by munufacture");
			System.out.println("8.Thoat");

			Scanner sc = new Scanner(System.in);
			System.out.println("Chon?");
			int c = sc.nextInt();
			if (c == 1) {
				createCar();
			} else if (c == 2) {
				updateCar();
			} else if (c == 3) {
				deleteCar();
			} else if (c == 4) {
				getCarById();
			} else if (c == 5) {
				searchCarByName();
			} else if (c == 6) {
				searchCarByPrice();
			} else if (c == 7) {
				searchCarByMunufacture();
			} else if (c == 8) {
				break;
			} else {
				System.out.println("Nhap tu 1 - 8");
			}
		}
	}

	public static void searchCarByName() {
		CarDao carDao = new CarDaoImpl();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap tu khoa can tim:");
		String name = sc1.nextLine();
		//
		List<Car> cars = carDao.search(name);
		if (cars.isEmpty()) {
			System.out.println("Khong tim thay");
		} else {
			for (Car car : cars) {
				info(car);
				System.out.println("-----------");
			}
		}
	}

	public static void searchCarByMunufacture() {
		CarDao carDao = new CarDaoImpl();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap nsx can tim:");
		String nsx = sc1.nextLine();
		//
		List<Car> cars = carDao.searchByManufature(nsx);
		if (cars.isEmpty()) {
			System.out.println("Khong tim thay");
		} else {
			for (Car car : cars) {
				info(car);
				System.out.println("-----------");
			}
		}
	}

	public static void searchCarByPrice() {
		CarDao carDao = new CarDaoImpl();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap gia tu:");
		long fromPrice = sc1.nextLong();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap gia den:");
		long toPrice = sc2.nextLong();
		//
		List<Car> cars = carDao.search(fromPrice, toPrice);
		if (cars.isEmpty()) {
			System.out.println("Khong tim thay");
		} else {
			for (Car car : cars) {
				info(car);
				System.out.println("-----------");
			}
		}
	}

	public static void getCarById() {
		CarDao carDao = new CarDaoImpl();
		/// DELETE
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap id can tim:");
		int id = sc1.nextInt();
		//
		Car car = carDao.get(id);
		if (car != null) {
			info(car);
		} else {
			System.out.println("Khong tim thay");
		}
	}

	public static void updateCar() {
		CarDao carDao = new CarDaoImpl();
		/// DELETE
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap id can update:");
		int id = sc1.nextInt();
		//
		Car car = new Car();
		car.setId(id);// id can update
		input(car);// nhap du lieu moi

		carDao.update(car);
		System.out.println("Thanh cong!");
	}

	public static void deleteCar() {
		CarDao carDao = new CarDaoImpl();
		/// DELETE
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap id can xoa:");
		int id = sc1.nextInt();
		//
		carDao.delete(id);
	}

	public static void createCar() {
		Car car = new Car();
		input(car);

		// TAO MOI
		// da hinh
		CarDao carDao = new CarDaoImpl();
		carDao.create(car);
		System.out.println("Thanh cong!");
	}

	public static void input(Car car) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		car.setName(sc1.nextLine());

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap gia:");
		car.setPrice(sc2.nextLong());

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Nhap hang:");
		car.setManufacture(sc3.nextLine());
		
		///NHAP THEM COUNTRY ID
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Nhap country id:");
		int countryId = sc4.nextInt();
		//tao doi tuo=;';
		Country country = new Country();
		country.setId(countryId);
		//tao quan he
		car.setCountry(country);
	}

	public static void info(Car car) {
		System.out.println("Id: " + car.getId());
		System.out.println("Name: " + car.getName());
		System.out.println("Price: " + car.getPrice());
		System.out.println("Manufature: " + car.getManufacture());

		// thong tin country
		if (car.getCountry() != null) {
			System.out.println("Country ID: " + car.getCountry().getId());
			System.out.println("Country Name: " + car.getCountry().getName());
		}

	}
}
