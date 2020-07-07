package main;

import model.ChuyenKhoa;
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
		
		///
		Student minh = new Student("Minh");
		minh.input();
		minh.info();
		
		///KHOA
//		ChuyenKhoa khoaToan = new ChuyenKhoa();
//		khoaToan.setName("toan");
		
		ChuyenKhoa khoaVan = new ChuyenKhoa();
		khoaVan.setName("VAN");

		minh.setKhoa(khoaVan);
		st.setKhoa(khoaVan);
		
		System.out.println(minh.getKhoa().getName());
		System.out.println(st.getKhoa().getName());
		
	}
}
