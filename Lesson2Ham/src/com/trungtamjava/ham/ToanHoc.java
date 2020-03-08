package com.trungtamjava.ham;

public class ToanHoc {
	public static void main(String[] args) {
		// SU DUNG HAM (co the dung nhieu lan)
		System.out.println("START MAIN");
		tong2So();
		hieu3So(90, 10, 20);// x = 90, y = 10, z = 20
		int kq = tong2So(5, 5); // tong cua return
		System.out.println(kq);// in ra kq = 10
		hieu3So(kq, 10, 5);// cho muc dich tinh toan khac
		System.out.println("tich 2 so la "+tich2So(10, 20));
		System.out.println("thuong 2 so la "+thuong(80, 40));
		System.out.println("END MAIN");
	}

	// DINH NGHIA HAM
	// ham void, khong co tham so vao
	public static void tong2So() {
		// body of method
		int x = 10;
		int y = 20;
		int tong = x + y;
		System.out.println("Tong 2 so la " + tong);
	}

	// ham void, co tham so
	public static void hieu3So(int x, int y, int z) {
		int hieu3So = x - y - z;
		System.out.println("Hieu 3 so la " + hieu3So);
	}
	// overload1: ham trung ten nhung khac so luong tham so (khac tham so)
	// Ex: public static void hieu3So(int x,int y)
	// public static void hieu3So(int x,int y, int z)

	// overload2: ham trung ten nhung khac kieu du lieu
	// Ex: public static void hieu3So(int x,int y, int z)
	// public static void hieu3So(double x,double y, double z)

	// ham int
	public static int tong2So(int x, int y) {
		int tong = x + y;
		return tong;
	}

	public static int tich2So(int a, int b) {
		int tich = a * b;
		return tich;
	}
	
	public static double thuong (double a, double b) {
		return a / b;
	}
}
