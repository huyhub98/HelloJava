package com.ifi.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.ifi.manager.CarManager;
import com.ifi.utils.Report;

public class Main {
	static CarManager manager;

	public static void main(String[] args) {
		//test();
		manager = new CarManager();
		Report report = new Report();
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		scheduler.scheduleWithFixedDelay(report, 0, 10, TimeUnit.SECONDS);
		CarManager.menu();
	}

	public static void test() {
//		Car car = new Honda();
//		Object obj = new Object();
//		car.setId(1);
//		car.setName("Honda civic");
//		car.setPrice(9000);
//		((Honda)car).setBrand(((Honda) car).getBrand());
//		((Honda)car).setModel("civic");
//		HondaServiceImpl hondaSerImpl = new HondaServiceImpl();
//		System.out.println(car.getId());
//		System.out.println(car.getName());
//		System.out.println(car.getPrice());
//		System.out.println(((Honda) car).getBrand());
//		System.out.println(((Honda) car).getModel());
	}
}
