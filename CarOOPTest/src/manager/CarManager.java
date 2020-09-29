package manager;

import com.ifi.model.*;
import com.ifi.service.*;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CarManager {
	LocalDateTime time;
	DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");

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
				// load();
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
		System.out.println("Danh sách : ");
		for (Object obj : cars) {
			System.out.println("--------------");
			if (obj instanceof Honda) {
				Honda hon = (Honda) obj;
				System.out.println(hon.getId());
				System.out.println(hon.getName());
				System.out.println(hon.getPrice());
				System.out.println(hon.getBrand());
				System.out.println(hon.getModel());
			} else if (obj1 instanceof Vinfast) {
				Vinfast vin = (Vinfast) obj1;
				System.out.println(vin.getId());
				System.out.println(vin.getName());
				System.out.println(vin.getPrice());
				System.out.println(vin.getBrand());
				System.out.println(vin.getModel());
			} else if (obj2 instanceof Mercedez) {
				Mercedez mer = (Mercedez) obj2;
				System.out.println(mer.getId());
				System.out.println(mer.getName());
				System.out.println(mer.getPrice());
				System.out.println(mer.getBrand());
				System.out.println(mer.getModel());
			} else if (obj3 instanceof Toyota) {
				Toyota toyota = (Toyota) obj3;
				System.out.println(toyota.getId());
				System.out.println(toyota.getName());
				System.out.println(toyota.getPrice());
				System.out.println(toyota.getBrand());
				System.out.println(toyota.getModel());
			} else if (obj4 instanceof Audi) {
				Audi au = (Audi) obj4;
				System.out.println(au.getId());
				System.out.println(au.getName());
				System.out.println(au.getPrice());
				System.out.println(au.getBrand());
				System.out.println(au.getModel());
			}
		}
	}

	public static void writeFile() {
		try {
			Car car = new Car();
			File file = new File("CarData.txt");

			// Doc du lieu cu ra neu ton tai
			if (file.exists()) {
				FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				// Doc du lieu cu ra gan vao list
				cars = (List<Car>) objectInputStream.readObject();
			}
			cars.add(car);
			// luu doi tuong
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(cars);
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
				show();
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void load() {
		try {
			FileInputStream fileInputStream = new FileInputStream("CarData.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			cars = (ArrayList) objectInputStream.readObject();
			objectInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String priceMaxFive() {
		String res = "";
		Collections.sort(cars, new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				return (int) (o2.getPrice() - o1.getPrice());
			}
		});

		for (int i = 0; i < 5; i++) {
			res += (cars.get(i)).getName() + " Price: " + (cars.get(i)).getPrice() + " dollar";
			res += "\n";
		}
		return res;
	}

	public void printReportFixedRate() {
		try {
			String topPrice = priceMaxFive();
			System.out.println(topPrice);
			time = LocalDateTime.now();
			String ftime = time.format(TIME_FORMAT);
			String fileName = "Top 5 Highest Price Car " + ftime;
			File output = new File(fileName + ".txt");
			FileWriter writer = new FileWriter(output);
			writer.write(topPrice);
			writer.flush();
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
