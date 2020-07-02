package com.quanghuy.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.quanghuy.dao.CarDao;
import com.quanghuy.dao.CarDaoImpl;
import com.quanghuy.model.Car;
import com.quanghuy.model.Country;

public class MainCar {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		while (true) {
			System.out.println("1.Nhập thông tin cho xe");
			System.out.println("2.Sửa thông tin xe");
			System.out.println("3.Xóa thông tin xe");
			System.out.println("4.Tìm xe theo id");
			System.out.println("5.Tìm xe theo tên");
			System.out.println("6.Tìm xe theo khoảng giá");
			System.out.println("7.Tìm xe theo nhà sản xuất");
			System.out.println("8.Tổng số xe");
			System.out.println("9.Tổng số tiền các xe");
			System.out.println("10.Giá tiền xe cao nhất");
			System.out.println("11.Thoát");
			int select = new Scanner(System.in).nextInt();
			if (select == 1) {
				createCar();
			} else if (select == 2) {
				updateCar();
			} else if (select == 3) {
				deleteCar();
			} else if (select == 4) {
				searchById();
			} else if (select == 5) {
				searchByName();
			} else if (select == 6) {
				searchByPrice();
			} else if (select == 7) {
				searchByManuafacture();
			} else if (select == 8) {
				getCarAmount();
			} else if (select == 9) {
				totalPrice();
			} else if (select == 10) {
				getMaxPrice();
			} else if (select == 11) {
				System.out.println("BYE");
				break;
			} else {
				System.out.println("Mời nhập lại lựa chọn từ 1 đến 10");
			}
		}
	}

	public static void createCar() {
		CarDao carDao = new CarDaoImpl();
		Car car = new Car();
		input(car);
		carDao.create(car);
		info(car);
	}

	public static void updateCar() {
		CarDao carDao = new CarDaoImpl();
		Car car = new Car();
		System.out.println("Nhập id xe cần sửa:");
		int id = new Scanner(System.in).nextInt();
		car.setId(id);
		input(car);
		carDao.update(car);
		System.out.println("Success!");
	}

	public static void deleteCar() {
		CarDao carDao = new CarDaoImpl();
		Car car = new Car();
		System.out.println("Nhập id xe cần xóa:");
		int id = new Scanner(System.in).nextInt();
		carDao.delete(id);
	}

	public static void searchById() {
		CarDao carDao = new CarDaoImpl();
		Car car = new Car();
		System.out.println("Nhập id xe cần tìm:");
		int id = new Scanner(System.in).nextInt();
		car = carDao.getId(id);
		if (car != null) {
			info(car);
		} else {
			System.out.println("Không tìm thấy");
		}
	}

	public static void searchByName() {
		CarDao carDao = new CarDaoImpl();
		System.out.println("Nhập vào tên xe cần tìm:");
		String name = new Scanner(System.in).nextLine();
		List<Car> cars = carDao.search(name);
		if (cars.isEmpty()) {
			System.out.println("Không tìm thấy");
		} else {
			for (Car car : cars) {
				info(car);
				System.out.println("-----------");
			}
		}
	}

	public static void searchByManuafacture() {
		CarDao carDao = new CarDaoImpl();
		System.out.println("Nhập vào tên nhà sản xuất:");
		String manufacture = new Scanner(System.in).nextLine();
		List<Car> cars = carDao.searchByManufacture(manufacture);
		if (cars.isEmpty()) {
			System.out.println("Không tìm thấy");
		} else {
			for (Car car : cars) {
				info(car);
				System.out.println("-----------");
			}
		}
	}

	public static void searchByPrice() {
		CarDao carDao = new CarDaoImpl();
		System.out.println("Nhập vào mức giá cần tìm");
		System.out.println("mức giá từ (from): ");
		double fromPrice = new Scanner(System.in).nextDouble();
		System.out.println("đến (to): ");
		double toPrice = new Scanner(System.in).nextDouble();
		List<Car> cars = carDao.search(fromPrice, toPrice);
		if (cars.isEmpty()) {
			System.out.println("Không tìm thấy xe trong khoảng giá này");
		} else {
			for (Car car : cars) {
				info(car);
				System.out.println("-----------");
			}
		}
	}

	public static void getCarAmount() {
		CarDao carDao = new CarDaoImpl();
		System.out.println("Số lượng xe đang có: ");
		System.out.println(carDao.getCarAmount() + " xe");
	}

	public static void totalPrice() {
		CarDao carDao = new CarDaoImpl();
		System.out.println("Tổng giá tiền các loại xe:");
		System.out.println(carDao.totalPrice() + " VNĐ");
	}

	public static void getMaxPrice() {
		CarDao carDao = new CarDaoImpl();
		Car car = carDao.getMaxPrice();
		System.out.println("Xe có giá tiền cao nhất:");
		if(car != null) {
			info(car);
		}else {
			System.out.println("Không có");
		}
	}

	public static void input(Car car) {
		System.out.println("Nhập vào id xe:");
		car.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhập vào tên xe:");
		car.setName(new Scanner(System.in).nextLine());
		System.out.println("Nhập vào giá xe:");
		car.setPrice(new Scanner(System.in).nextDouble());
		System.out.println("Nhập vào nhà sản xuất:");
		car.setManufacture(new Scanner(System.in).nextLine());

		Country country = new Country();
		System.out.println("Nhập id quốc gia:");
		country.setId(new Scanner(System.in).nextInt());
		car.setCountry(country);
	}

	public static void info(Car car) {
		System.out.println("ID xe: " + car.getId());
		System.out.println("Tên xe: " + car.getName());
		System.out.println("Giá tiền: " + car.getPrice() + " VNĐ");
		System.out.println("Nhà sản xuất: " + car.getManufacture());
		if (car.getCountry() != null) {
			System.out.println("ID quốc gia: " + car.getCountry().getId());
			System.out.println("xuất xứ: " + car.getCountry().getName());
		}
	}
}
