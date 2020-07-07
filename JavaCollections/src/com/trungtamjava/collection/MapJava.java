package com.trungtamjava.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.trungtamjava.model.Person;

///map: dictionary: key/value
public class MapJava {

	public static void main(String[] args) {
		Map<String, Person> personMap = new HashMap<>();
		
		/// them doi tuong vao list
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("P1");
		Person p2 = new Person();
		p2.setId(1);
		p2.setName("P2");

		///add vao map
		personMap.put("phuong", p1);
		personMap.put("phuong", p2);//update
		
		System.out.println(personMap.size());
		
		Person p = personMap.get("phuong");//get theo key
		System.out.println(p.getName());
		//doc ra tap key
		Set<String> keySet = personMap.keySet();
		
		for (String key : keySet) {
			Person pp = personMap.get(key);
			System.out.println(pp.getName());
		}
		
		for (Entry<String, Person> entry : personMap.entrySet()) {
			String key = entry.getKey();
			Person pp = entry.getValue();//
			System.out.println(pp.getName());
		}
		///?XOA theo key
		//ko co thi ko xoa
		personMap.remove("tho");//
		///xoa het
		personMap.clear();
	}
}
