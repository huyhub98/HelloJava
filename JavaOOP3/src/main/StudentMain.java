package main;

import model.Student;

public class StudentMain {
	public static void main(String[] args) {
		// tao doi tuong
		Student st = new Student();

		st.setName("Huy");// st.name="Huy"
		st.setAge(30);
		
		System.out.println(st.getName());
		
		st.setClazz("15");//JAVA-15
		System.out.println(st.getClazz());
		
		///ke thua
		Student minh = new Student("Minh");

		minh.input();
		minh.info();
		
		
		
	}
}
