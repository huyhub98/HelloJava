package com.trungtamjava.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.trungtamjava.model.Person;

public class SetPerson {
	public static void main(String[] args) {
		Set<Person> personSet = new HashSet<>();

		/// them doi tuong vao list
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("P1");
		
		Person p2 = new Person();
		p2.setId(1);
		p2.setName("P2");
		
		Person p3 = new Person();
		p3.setId(1);
		p3.setName("P2");
		//p1,p2,p3 co id bang nhau, hashcode bang nhau
		/// equals nhau
		// set su dung hashCode va equals de 
		//chi ra cac doi tuong them vao co giong nhau ko.
		personSet.add(p1);// 0
		personSet.add(p2);
		personSet.add(p1);
		personSet.add(p2);// 3
		personSet.add(p3);// 3
		System.out.println(personSet.size());

		// for each
		for (Person b : personSet) {
			System.out.println(b.getName());
		}
		// xoa
		personSet.remove(p1);
		for (Person b : personSet) {
			System.out.println(b.getName());
		}
		// xoa nh thang trong list
		Iterator<Person> itr = personSet.iterator();
		while (itr.hasNext()) {
			Person b = itr.next();
			if (b.getName().equals("P2")) {
				itr.remove();// xoa thang hientai
			}
		}
	}
}
