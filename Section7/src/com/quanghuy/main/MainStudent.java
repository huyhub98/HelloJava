package com.quanghuy.main;

import java.util.Scanner;

import com.quanghuy.model.Student;

public class MainStudent {

	public static void main(String[] args) {
		System.out.println("Nhập vào số phần tử:");
		int n = new Scanner(System.in).nextInt();
		Student[] stu = new Student[n];
		for (int i = 0; i < stu.length; i++) {
			System.out.println("nhập vào sinh viên thứ " + (i + 1));
			stu[i]= new Student();
			stu[i].input();
		}
		System.out.println("Thông tin sinh viên vừa nhập:");
		for(Student s : stu) {
			s.info();
		}

	}

}
