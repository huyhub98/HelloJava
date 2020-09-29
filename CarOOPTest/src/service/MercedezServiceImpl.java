package service;

import com.ifi.model.Car;
import com.ifi.model.Mercedez;

import java.util.Scanner;

public class MercedezServiceImpl extends CarServiceImpl {

	Mercedez mer = new Mercedez();
	@Override
	public void input(Car car) {
		super.input(car);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào mẫu xe: ");
		mer.setModel(sc.nextLine());
	}

	@Override
	public void info(Car car) {
		super.info(car);
		System.out.println("Hãng xe: " + mer.getBrand());
		System.out.println("Mẫu xe: " + mer.getModel());
	}
	
}
