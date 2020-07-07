package main;

import model.Car;

public class MainCar {
	public static void main(String[] args) {
		Car car = new Car();// 1
		car.input();
		car.info();

		Car sonata = new Car();
		sonata.input();
		sonata.info();
		sonata.fuelConsume();
		sonata.printMe();
		sonata.importMe();
	}

}
