package model;

import java.util.Scanner;

public class Student extends Nguoi{
	private String clazz;
	//constructor
	public Student() {
	}

	public Student(String name) {
		super.setName(name);
	}

	public void setClazz(String c) {
		clazz = "JAVA-" + c;
	}

	public String getClazz() {
		return this.clazz;
	}

	@Override
	public void info() {
		super.info();
		System.out.println(clazz);
		System.out.println("---------");
	}
	
	public void input() {
		super.input();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Nhap class:");
		this.clazz = sc3.nextLine();
		
	}
}
