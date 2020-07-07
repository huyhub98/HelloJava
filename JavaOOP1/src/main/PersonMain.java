package main;

import model.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person.name = "Java";
		Person.age = 20;
		Person.talk();// goi ham class khac

		//// TAO DOI TUONG
		new Person();// 1
		new Person();// 2
		Person java = new Person();// 3
		Person p = new Person();// 4

		java.name = "Java";
		java.address = "Hanoi";
		p.name = "P";
		p.address = "HCM";

		Person.name = "Person";
		java.talk();
		p.talk();
		System.out.println("-------");
		// bien static
		System.out.println(java.name);
		System.out.println(p.name);
		// bien non-static
		System.out.println(java.address);
		System.out.println(p.address);

	}
}
