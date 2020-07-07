package com.trungtamjava.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.trungtamjava.model.Book;
import com.trungtamjava.service.BookService;
import com.trungtamjava.service.BookServiceImpl;

public class MainBook {

	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();

		List<Book> bookList = new ArrayList<Book>();

		while (true) {
			Book b = new Book();
			// Input cho book: da hinh
			bookService.input(b);// book = b
			// add vao list
			bookList.add(b);
			
			System.out.println("Tiep tuc khong? (K:Thoat)");
			Scanner sc = new Scanner(System.in);
			String option = sc.nextLine();
			if (option.equals("K")) {
				break;
			}
		}

		for (Book book : bookList) {
			// info
			bookService.info(book);
		}
		
		//anonymous class
		/// o1 truoc o2 thi se am (-)
		// o2 sau o2 thi se duong (+)
		// 0 nghia la bagn nhau theo tieu chi so sanh. co the dung them cau dieu kien long nhau de so sanh tiep
		Collections.sort(bookList, new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				int diff =  o1.getName().compareTo(o2.getName());
				if (diff == 0) {
					return o1.getId() - o2.getId();
				}
				return diff;
			}
		});
	}
}
