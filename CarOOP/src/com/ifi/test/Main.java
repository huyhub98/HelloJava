package com.ifi.test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.ifi.manager.CarManager;
import com.ifi.model.Audi;
import com.ifi.model.Car;
import com.ifi.model.Honda;
import com.ifi.model.Mercedez;
import com.ifi.model.Toyota;
import com.ifi.model.Vinfast;
import com.ifi.service.HondaServiceImpl;

public class Main {
	public static void main(String[] args) {
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

		CarManager.menu();
	}
}
