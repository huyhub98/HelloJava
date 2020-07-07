package service;

import java.util.Scanner;

import model.Address;
import model.Employee;
import model.Person;

public class PersonServiceImpl implements PersonService {

	@Override
	public void input(Person p) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		p.setName(sc1.nextLine());

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap tuoi:");
		p.setAge(sc2.nextInt());

		// tao doi tuong address
		Address hanoi = new Address();
		AddressServiceImpl addService = new AddressServiceImpl();
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
	
	@Override
	public void info(Person p) {
		System.out.println("__INFO__");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		/// address
		Address address = p.getAddress();
		if (address != null) {
			AddressServiceImpl addService = new AddressServiceImpl();
			addService.info(address);// add = address
		}

		if (p instanceof Employee) {
			Employee e = (Employee) p;
			System.out.println("EMPLOYEE");
			System.out.println(e.getExpYears());
		}
	}
}
