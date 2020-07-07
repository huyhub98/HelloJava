package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.model.Address;
import com.trungtamjava.model.Person;
import com.trungtamjava.model.Student;
import com.trungtamjava.model.Teacher;

public class MainDaHinh2 {
	public static void main(String[] args) {
		// 1 dia chi
		Address hanoi = new Address();
		hanoi.input();

		// 2 sinh vien
		Person trang = new Student();
		trang.input();// ? goi ham cua doi tuong Student khi chay. cha chi la thang dai dien
		trang.setAddress(hanoi);

		Student uyen = new Student();
		uyen.input();
		uyen.setAddress(hanoi);// cung dia chi

		infoPerson(uyen);// ?p = uyen : da hinh
		infoPerson(trang);// ?p = trang

		// student
		Person quyet = new Student();
		quyet.input();

		infoPerson(quyet);

		// tuong tu teacher
		Teacher tc = new Teacher();
		tc.input();

		infoPerson(tc);
	}

	/// Gia su thay vi phai viet info trong tung class model.
	// Chung ta co the dung da hinh, tao 1 ham nhu ben duoi de su dung cho tat ca
	// tao ham da hinh info de xuat thong tin cua tat ca class la Person hoac con
	/// Person
	public static void infoPerson(Person p) {
		System.out.println("Id " + p.getId());
		System.out.println("Name " + p.getName());
		System.out.println("---------");

		if (p instanceof Student) {// kiem tra xem p truyen vao la class con nao
			Student st = (Student) p;// ep ve kieu con va goi ham cua class con
			System.out.println("Score " + st.getScore());// goi ham
		}

		if (p instanceof Teacher) {
			Teacher tc = (Teacher) p;// ep ve kieu con va goi ham cua class con
			System.out.println("Co quan " + tc.getDepartment());
		}

		// lay dia chi ra, has a, check null de dam bao moi doi tuong truyen vao can co
		// address thi moi in
		if (p.getAddress() != null) {
			p.getAddress().info();
		}
	}

	// tuong tu thu gom ham input, bai tap
	public static void inputPerson(Person p) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap Id:");
		p.setId(sc2.nextInt());

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		p.setName(sc1.nextLine());

		System.out.println("---------");

		if (p instanceof Student) {// kiem tra xem p truyen vao la class con nao
			Student st = (Student) p;// ep ve kieu con va goi ham cua class con
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Nhap Diem:");
			st.setScore(sc3.nextInt());
		}

		if (p instanceof Teacher) {
			Teacher tc = (Teacher) p;// ep ve kieu con va goi ham cua class con
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Nhap Co quan:");
			tc.setDepartment(sc3.nextLine());
		}

		// 1 dia chi
		Address hanoi = new Address();
		hanoi.input();

		p.setAddress(hanoi);
	}
}
