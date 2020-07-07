package com.trungtamjava.model;

public class Main {
	public static void main(String[] args) {
		/// tao class con cua Person
		// ko co ten: anonymous
		Person a = new Person() {
			@Override
			public void info() {
				System.out.println("Anonymous");
			}
		};
		a.setName("A");
		a.info();
	}
}
