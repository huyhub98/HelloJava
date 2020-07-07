package com.trungtamjava.main;

import com.trungtamjava.model.Address;
import com.trungtamjava.model.Person;
import com.trungtamjava.model.Student;

public class MainDaHinh {
	public static void main(String[] args) {
		Student sv = new Student();
		sv.input();
		
		//https://www.youtube.com/watch?v=vc-IrwoVQGw&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=49
		// da hinh: cha co the dai dien
		// cho con
		Person p = new Student();
		
		///https://www.youtube.com/watch?v=5ehx1FbyAXY&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=50
		Object object = new Student();

		System.out.println(sv.getScore());
		// cha ko the goi thuoc tinh/ham cua con
		// System.out.println(p.getSchool());
		// System.out.println(obj.getName());

		//https://www.youtube.com/watch?v=pmUDoMU_0F0&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=51
		// EP KIEU
		long l = 100000l;
		int k = (int) l;
		// bac cau + ep kieu xuong con
		if (p instanceof Student) {
			Student st = (Student) p;
			// de co the goi dc ham cua con
			System.out.println(st.getScore());
		}

		//https://www.youtube.com/watch?v=ZVJiCEUIe1w&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=52
		// Can phai check kieu doi tuong
		// truoc khi ep xuong
		Object obj = new Address();

		if (obj instanceof Student) {
			Student minh = (Student) obj;//
		}

		////Tat ca chi la mot doi tuong
		Student uyen = new Student();
		uyen.input();
		
		Person person = uyen; //bac cau + da hinh
		Object o = person;//?bac cau + da hinh
		
		person.info();
		uyen.info();
	}
	
}
