package model;


//https://www.youtube.com/watch?v=yFQumeu2U-A&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=34&t=1s
public class Person {
	///thuoc tinh: bien
	//https://www.youtube.com/watch?v=UBOWNALuQcw&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=37&t=1s
	public static String name;//static
	public static int age = 10;//0
	public String address;//non-static, bien object
	
	///hanh vi: ham
	public static void talk() {
		System.out.println(name + " Noi chuyen");
	}
}
