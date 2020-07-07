package main;

import model.Teacher;

public class TeacherMain {
	public static void main(String[] args) {
		Teacher tc = new Teacher();
		
//		tc.setName("Java");
//		System.out.println(tc.getName());
//		
//		tc.setAge(30);
//		System.out.println(tc.getAge());
		
		tc.input();
		
		tc.info();
		
	}
}
