package service;

import com.ifi.model.Car;
import com.ifi.model.Honda;

import java.util.Scanner;

public class HondaServiceImpl extends CarServiceImpl {

	Honda honda = new Honda();
	@Override
	public void input(Car car) {
		super.input(car);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào mẫu xe: ");
		honda.setModel(sc.nextLine());
	}

	@Override
	public void info(Car car) {
		super.info(car);
		System.out.println("Hãng xe: " + honda.getBrand());
		System.out.println("Mẫu xe: " + honda.getModel());
	}

}
