package com.trungtamjava.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//https://www.youtube.com/watch?v=udPwiT4zbhE
public class WrapperClass {
	public static void main(String[] args) {
		int x = 10;
		List<Integer> numberList = new ArrayList<>();
		List<Long> numberLongList = new ArrayList<>();
		List<Boolean> numberBooleanList = new ArrayList<>();
		List<Character> numberCharList = new ArrayList<>();
		
		String s = new String("Hello Java");
		String s2 = "Java";
		///
		Integer k = new Integer(10);
		//autobox
		Integer h = 10;//new Integer(10)
		
		int z = h;//?unbox
		
		System.out.println(z);
		
		Double d1 = new Double(10);
		Double d2 = new Double(10);
		double d3 = 10;
		if(d1 == d2) {
			System.out.println("dung");
		}
		if(d1 == d3) {
			System.out.println("dung");
		}
		
		Set<Long> longNumberSet 
			= new TreeSet<>();
		longNumberSet.add(new Long(100));
		longNumberSet.add(10L);
		longNumberSet.add(new Long(10));
		//chuyen set ve list
		List<Long> longNumberList = 
				new ArrayList<>(longNumberSet);
		
		///comparator
		longNumberList.sort(new Compare2Number());
		
		for (Long l : longNumberList) {
			System.out.println(l);
		}
		
		//JAVA 8
		longNumberList.forEach(l -> {
			System.out.println(l);
		});
	}
}

class Compare2Number implements Comparator<Long> {

	@Override
	public int compare(Long o1, Long o2) {
		if (o1 < o2) {
			return -1;
		} 
		
		if (o1 > o2) {
			return 1;
		} 
		
		return 0;
	}
	
}


