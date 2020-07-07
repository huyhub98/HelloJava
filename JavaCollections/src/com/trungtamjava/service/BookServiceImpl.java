package com.trungtamjava.service;

import java.util.Scanner;

import com.trungtamjava.model.Book;

public class BookServiceImpl implements BookService {

	@Override
	public void input(Book book) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		book.setName(sc1.nextLine());

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap Id:");
		book.setId(sc2.nextInt());
	}

	@Override
	public void info(Book book) {
		System.out.println("__INFO__");
		System.out.println(book.getName());
		System.out.println(book.getId());		
	}
	
}
