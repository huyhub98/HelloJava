package com.trungtamjava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.trungtamjava.model.Book;

public class ListExam {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		ArrayList books2 = new ArrayList();
		List books3 = new Vector();
		
		///them doi tuong vao list
		Book book1 = new Book();
		book1.setName("Book1");
		Book book2 = new Book();
		book2.setName("Book2");
		
		///them doi tuong vao list
		books.add(book1);//0
		books.add(book2);//1
		books.add(book2);//2
		books.add(book2);//3		
		books.add(book1);//4
		
		System.out.println("Size: " + books.size());
		
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			System.out.println(b.getName());
		}
		//for each
		for (Book b : books) {
			System.out.println(b.getName());
		}
		
		//xoa 
		books.remove(0);//xoa vi tri 0
		books.remove(book2);//xoa theo doi tuongs
		
		///3 vong
		for (Book b : books) {
			books.remove(b);
			break;
		}
		//xoa nh thang trong list
		Iterator<Book> itr = books.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			if (b.getName().equals("Book2")) {
				itr.remove();//xoa thang hientai
			}
		}
		
	}	
}
