package com.trungtamjava.service;

import java.util.Scanner;

import com.trungtamjava.model.Address;
import com.trungtamjava.model.Employee;
import com.trungtamjava.model.Person;

public class PersonServiceImpl implements PersonService {
	public  void info(Person p) {
		System.out.println("__INFO__");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		/// address
		Address address = p.getAddress();
		if (address != null) {
			// System.out.printsln(p.getAddress().getStreet());
//			System.out.println(add.getStreet());
//			System.out.println(add.getCity());
			AddressService addService 
				= new AddressServiceImpl();
			addService.info(address);// add = address
		}
		p.salary();/// ham abstract
		if (p instanceof Employee) {
			Employee e = (Employee) p;
			System.out.println("EMPLOYEE");
			System.out.println(e.getExpYears());
		}
	}

	public  void input(Person p) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		p.setName(sc1.nextLine());

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap tuoi:");
		p.setAge(sc2.nextInt());

		// tao doi tuong address
		Address hanoi = new Address();
		AddressService addService 
			= new AddressServiceImpl();
		addService.input(hanoi);// add = hanoi

		p.setAddress(hanoi);// tao qhe
		// set thong tin cua con
		if (p instanceof Employee) {
			Employee e = (Employee) p;

			Scanner sc3 = new Scanner(System.in);
			System.out.println("Nhap so nam kn:");
			e.setExpYears(sc3.nextInt());
		}
	}
}
