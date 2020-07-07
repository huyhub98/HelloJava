package com.trungtamjava.model;

public class Employee extends Person {
	private int expYears;//
	
	@Override
	public void salary() {
		System.out.println("Luong: " + 
				(expYears * 3000000));
	}

	public int getExpYears() {
		return expYears;
	}

	public void setExpYears(int expYears) {
		this.expYears = expYears;
	}

	
	
}
