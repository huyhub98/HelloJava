package com.ifi.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.ifi.model.Audi;
import com.ifi.model.Car;
import com.ifi.model.Honda;
import com.ifi.model.Mercedez;
import com.ifi.model.Toyota;
import com.ifi.model.Vinfast;
import com.ifi.service.AudiServiceImpl;
import com.ifi.service.CarServiceImpl;
import com.ifi.service.HondaServiceImpl;
import com.ifi.service.MercedezServiceImpl;
import com.ifi.service.ToyotaServiceImpl;
import com.ifi.service.VinfastServiceImpl;

public class CarManager {
	public static List<Honda> hondas = new ArrayList<Honda>();
	public static List<Vinfast> vinfasts = new ArrayList<Vinfast>();
	public static List<Mercedez> mercedezs = new ArrayList<Mercedez>();
	public static List<Toyota> toyotas = new ArrayList<Toyota>();
	public static List<Audi> audis = new ArrayList<Audi>();
	public static List<Car> cars = new ArrayList<Car>();

	public static Object obj = new Honda();
	public static Object obj1 = new Vinfast();
	public static Object obj2 = new Mercedez();
	public static Object obj3 = new Toyota();
	public static Object obj4 = new Audi();

	public static HondaServiceImpl hondaService = new HondaServiceImpl();
	public static VinfastServiceImpl vinService = new VinfastServiceImpl();
	public static MercedezServiceImpl merService = new MercedezServiceImpl();
	public static ToyotaServiceImpl toyotaService = new ToyotaServiceImpl();
	public static AudiServiceImpl audiService = new AudiServiceImpl();
	public static CarServiceImpl carService = new CarServiceImpl();

	// menu chính
	public static void menu() {
		while (true) {
			System.out.println("1. Nhập vào thông tin xe");
			System.out.println("2. Hiển thị thông tin xe");
			System.out.println("3. Xóa thông tin xe");
			System.out.println("4. Thông tin xe đắt nhất");
			System.out.println("5. Cập nhật thông tin xe");
			System.out.println("6. Write File");
			System.out.println("7. Load file");
			System.out.println("8. Thoát");
			int option = new Scanner(System.in).nextInt();
			if (option == 1) {
				carAddOption();
			} else if (option == 2) {
				carInfoOption();
			} else if (option == 3) {
				System.out.println("Nhập id xe cần xóa: ");
				int id = new Scanner(System.in).nextInt();
				cars.remove(id - 1);
				System.out.println("--------------------");
				System.out.println("Danh sách sau khi xóa: ");
				for (Car car : cars) {
					carService.info(car);
				}
			} else if (option == 4) {
				// tìm xe có giá đắt nhất
				Car car = Collections.max(cars, Comparator.comparing(c -> c.getPrice()));
				System.out.println("Xe đắt nhất là: " + car.getName());
			} else if (option == 5) {
				System.out.println("Nhập id xe muốn update:");
				int id = new Scanner(System.in).nextInt();
				updateCar(id);
			} else if (option == 6) {
				writeFile();
			} else if (option == 7) {
				loadFile();
			} else if (option == 8) {
				System.out.println("BYE");
				break;
			} else {
				break;
			}
		}
	}

	// menu nhập thông tin cho từng loại xe
	public static void carAddOption() {
		while (true) {
			System.out.println("Mời bạn chọn nhập thông tin cho loại xe:");
			System.out.println("1.Honda");
			System.out.println("2.Vinfast");
			System.out.println("3.Mercedez");
			System.out.println("4.Toyota");
			System.out.println("5.Audi");
			System.out.println("6.Thoát");
			int n = new Scanner(System.in).nextInt();
			if (n == 1) {
				if (obj instanceof Honda) {
					Honda hon = (Honda) obj;
					hondaService.input(hon);
					hondas.add((Honda) hon);
					cars.add(hon);
				}
			} else if (n == 2) {
				if (obj1 instanceof Vinfast) {
					Vinfast vinf = (Vinfast) obj1;
					vinService.input(vinf);
					vinfasts.add((Vinfast) vinf);
					cars.add(vinf);
					// System.out.println("đây là test: " + vinf.getModel().toString());
				}
			} else if (n == 3) {
				if (obj2 instanceof Mercedez) {
					Mercedez merc = (Mercedez) obj2;
					merService.input(merc);
					mercedezs.add((Mercedez) merc);
					cars.add(merc);
				}
			} else if (n == 4) {
				if (obj3 instanceof Toyota) {
					Toyota toyo = (Toyota) obj3;
					toyotaService.input(toyo);
					toyotas.add((Toyota) toyo);
					cars.add(toyo);
				}
			} else if (n == 5) {
				if (obj4 instanceof Audi) {
					Audi au = (Audi) obj4;
					audiService.input(au);
					audis.add((Audi) au);
					cars.add(au);
				}
			} else if (n == 6) {
				System.out.println("BYE");
				break;
			} else {
				break;
			}
		}
	}

	// Car info
	public static void carInfoOption() {
		while (true) {
			System.out.println("Mời bạn chọn thông tin xe muốn hiển thị:");
			System.out.println("1.Honda");
			System.out.println("2.Vinfast");
			System.out.println("3.Mercedez");
			System.out.println("4.Toyota");
			System.out.println("5.Audi");
			System.out.println("6.Thoát");
			int n = new Scanner(System.in).nextInt();
			if (n == 1) {
				if (hondas == null) {
					System.out.println("danh sách trống");
				} else {
					for (Honda honda : hondas) {
						hondaService.info(honda);
					}
				}
			} else if (n == 2) {
				if (vinfasts == null) {
					System.out.println("danh sách trống");
				} else {
					for (Vinfast vin : vinfasts) {
						vinService.info(vin);
					}
				}
			} else if (n == 3) {
				if (mercedezs == null) {
					System.out.println("danh sách trống");
				} else {
					for (Mercedez mer : mercedezs) {
						merService.info(mer);
					}
				}
			} else if (n == 4) {
				if (toyotas == null) {
					System.out.println("danh sách trống");
				} else {
					for (Toyota toyo : toyotas) {
						toyotaService.info(toyo);
					}
				}
			} else if (n == 5) {
				if (audis == null) {
					System.out.println("danh sách trống");
				} else {
					for (Audi au : audis) {
						audiService.info(au);
					}
				}
			} else if (n == 6) {
				System.out.println("goodbye");
				break;
			} else {
				break;
			}
		}
	}

	public static void updateCar(int id) {
		System.out.println("Nhập vào tên xe:");
		String name = new Scanner(System.in).nextLine();
		cars.get(id - 1).setName(name);
		System.out.println("Nhập vào giá xe");
		long price = new Scanner(System.in).nextLong();
		cars.get(id - 1).setPrice(price);
		System.out.println("Nhập vào model: ");
		String model = new Scanner(System.in).nextLine();
		if (obj instanceof Honda) {
			Honda hon = (Honda) obj;
			hon.setModel(model);
		} else if (obj4 instanceof Audi) {
			Audi au = (Audi) obj4;
			au.setModel(model);
		} else if (obj2 instanceof Mercedez) {
			Mercedez mer = (Mercedez) obj2;
			mer.setModel(model);
		} else if (obj1 instanceof Vinfast) {
			Vinfast vin = (Vinfast) obj1;
			vin.setModel(model);
		} else if (obj3 instanceof Toyota) {
			Toyota toyota = (Toyota) obj3;
			toyota.setModel(model);
		}

		show();
	}

	public static void show() {
		System.out.println("Danh sách sau khi update: ");
		for (Object obj : cars) {
			System.out.println("--------------");
			if (obj instanceof Honda) {
				Honda hon = (Honda) obj;
				System.out.println(hon.getId());
				System.out.println(hon.getName());
				System.out.println(hon.getPrice());
				System.out.println(hon.getBrand());
				System.out.println(hon.getModel());
			}
		}
	}

	public static void writeFile() {
		try {
			Car car = new Car();
			File file = new File("CarData.txt");

			// Doc du lieu cu ra neu ton tai

			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			// luu doi tuong
			objectOutputStream.writeObject(car);
			System.out.println("Đã ghi file!");

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void loadFile() {
		try {
			File file = new File("CarData.txt");
			if (file.exists()) {
				FileInputStream fileInputStream = new FileInputStream(file);
				cars = (List<Car>) new ObjectInputStream(fileInputStream).readObject();
				for (Car c : cars) {
					System.out.println(c.getName());
					System.out.println(c.getId());
					System.out.println(c.getPrice());
					System.out.println(((Honda) c).toString());

				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

//	public static void topFive() {
//		String max = "";
//		Collections.sort(cars, new Comparator<Car>() {
//
//			@Override
//			public int compare(Car o1, Car o2) {
//				return (int) (o2.getPrice() - o1.getPrice());
//			}
//		});
//		for (int i = 0; i < 5; i++) {
//			max = (Car) cars.get(i).getName() + "Giá: " + (Car) cars.get(i).getPrice();
//		}
//	}
}
