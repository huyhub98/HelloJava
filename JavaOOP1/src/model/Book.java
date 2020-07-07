package model;

import java.util.Scanner;

//https://www.youtube.com/watch?v=yFQumeu2U-A&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=34&t=1s
public class Book {
	public String name;
	public int price;
	public String publisher;

	
	//https://www.youtube.com/watch?v=qPV8zVtG9tU&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=36&t=272s
	// luon co 1 constructor mac dinh
	// Nhung neu lo tay khai bao
	// 1 constructor thi cai mac dinh bien mat
	/// NOTE: Nen khi lam thi nen xem xet
	// khai bao 1 cai mac dinh trc, roi tuy bien them
	// constructor: khoi tao doi tuong
	public Book() {
		// constructor mac dinh
		System.out.println("Mac Dinh");
	}

	// overload constructor: khoi tao vao 
	//truyen vao vai thong tin cho bien
	public Book(String n) {
		name = n;
	}

	public Book(String n, int pr) {
		name = n;
		price = pr;
	}
	
	//https://www.youtube.com/watch?v=fw5gTGmey8E&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=35&t=190s
	public void info() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(publisher);
		System.out.println("---------");
	}

	
	public void input() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap ten:");
		name = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap gia:");
		price = sc2.nextInt();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Nhap nxb:");
		publisher = sc3.nextLine();
	}
}
