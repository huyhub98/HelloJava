package com.trungtamjava.javafile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.trungtamjava.model.Person;

public class MainObjectFile {
	public static void main(String[] args) {
		writeFile();
		readFile();
	}

	public static void readFile() {
		try {
			File file = new File("person.txt");
			if (file.exists()) {
				FileInputStream fileInputStream = new FileInputStream(file);

				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

				Person p = (Person) objectInputStream.readObject();
				System.out.println(p.getName());
				System.out.println(p.getId());
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void writeFile() {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("person.txt");

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			// tao doi tuong
			Person p = new Person();
			p.setId(1);
			p.setName("P");
			// luu doi tuong
			objectOutputStream.writeObject(p);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public static void writeListToFile() {
		try {
			// tao doi tuong
			Person p = new Person();
			p.setId(1);
			p.setName("P");

			List<Person> persons = new ArrayList<Person>();

			File file = new File("personList.txt");
			
			// Doc du lieu cu ra neu ton tai
			if (file.exists()) {
				FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				// Doc du lieu cu ra gan vao list
				persons = (List<Person>) objectInputStream.readObject();
			}
			/// Add them person vao list
			persons.add(p);

			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			// luu doi tuong
			objectOutputStream.writeObject(persons);

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void readListFromFile() {
		try {
			File file = new File("personList.txt");
			if (file.exists()) {
				FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

				List<Person> persons = (List<Person>) objectInputStream.readObject();
				for (Person p : persons) {
					System.out.println(p.getName());
					System.out.println(p.getId());
				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
