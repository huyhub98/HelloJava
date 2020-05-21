package com.quanghuy.main;

import java.util.Scanner;

import com.quanghuy.model.Student;
import com.quanghuy.model.Teacher;

public class MainTeacher {

	public static void main(String[] args) {
		System.out.println("Nhập vào số phần tử:");
		int n = new Scanner(System.in).nextInt();
		Teacher[] teacher = new Teacher[n];
		for (int i = 0; i < teacher.length; i++) {
			System.out.println("nhập vào thông tin giáo viên thứ " + (i + 1));
			teacher[i]= new Teacher();
			teacher[i].input();
		}
		System.out.println("Thông tin giáo viên vừa nhập:");
		for(Teacher t : teacher) {
			t.info();
		}
	}

}
