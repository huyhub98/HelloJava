package com.trungtamjava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.trungtamjava.model.Person;

public class ListPerson {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		/// them doi tuong vao list
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("P1");
		Person p2 = new Person();
		p2.setId(1);
		p2.setName("P2");
		
		if(p1 == p2) {
			//?p1, va p2 la 2 doi tuong khac nhau
			///???false
		}
		
		boolean check = p1.equals(p2);///?true
		///Vi: p1 va p2 co id = do override ham equals
		System.out.println(check);

		persons.add(p1);// 0
		persons.add(p1);
		persons.add(p1);
		persons.add(p2);// 3

		// for each
		for (Person b : persons) {
			System.out.println(b.getName());
		}
		// delete
		persons.remove(3);
		// xoa nh thang trong list
		Iterator<Person> itr = persons.iterator();
		while (itr.hasNext()) {
			Person b = itr.next();
			if (b.getName().equals("P2")) {
				itr.remove();// xoa thang hientai
			}
		}
		
	}
}
