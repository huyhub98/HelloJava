package com.trungtamjava.model;

public class Person {
	private String name;

	public void info() {
		System.out.println(this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
