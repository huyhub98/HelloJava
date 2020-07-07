package main;

import model.Book;

public class BookMain {
	public static void main(String[] args) {
		Book java = new Book();
		Book sql = new Book();
		// set thong tin
//		
//		sql.name = "SQL";
//		sql.price = 5000000;
//		sql.publisher = "SQL";

		// Scanner sc1 = new Scanner(System.in);
//		System.out.println("Nhap ten:");
//		java.name = sc1.nextLine();
//		
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("Nhap gia:");
//		java.price = sc2.nextInt();
//		
//		Scanner sc3 = new Scanner(System.in);
//		System.out.println("Nhap nxb:");
//		java.publisher= sc3.nextLine();
		
		/// TAO HAM CHUNG
		java.input();
		sql.input();
		// info
		java.info();
		sql.info();
		
		////TEST THU Constructor
		Book html = new Book("HTML");// name = "HTML"
		Book jsp = new Book("JSP",40000);//name = jsp, price=40000
	}
	
}
