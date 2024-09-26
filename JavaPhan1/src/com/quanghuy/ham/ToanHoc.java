package com.trungtamjava.ham;

public class ToanHoc {
	public static void main(String[] args) {
		/// SU DUNG
		System.out.println("START MAIN");
		tong();// co dau (), x = 10, y = 20
		tong();

		hieu(5, 10);// x = 5, y = 10
		// khi su dung co the lay ket qua tra ve
		int kq = tong2So(5, 10);
		System.out.println(kq);

		System.out.println("END MAIN");
	}

	// DINH NGHIA HAM
	// ham void, ko truyen vao tham so
	public static void tong() {
		// body of method
		int x = 10;
		int y = 20;
		int tong = x + y;

		System.out.println(tong);
	}

	// ham void, truyen vao tham so: muc dich truyen gia tri tu ngoai vao
	public static void hieu(int x, int y) {
		// body of method
		// ben trong ham co the su dung cac bien o tham so
		System.out.println(x - y);
	}

	/// ham tra ve gia tri, thay void bang kieu gia tri tra ve
	public static int tong2So(int x, int y) {
		int tong = x + y;
		return tong;// ket thuc ham
		// System.out.println(tong);
	}

	public static double tich(double a, double b) {
		double tich = a * b;
		return tich;
	}
	
	//co the kieu du lieu tra ve to hon
	public static long thuong(int a, int b) {
		return a / b;
	}

	// overload: ham trung ten, khac so luong tham so
	public static void hieu(int x, int y, int z) {
		// body of method
		System.out.println(x - y);
	}

	// overload: trung ten, khac kieu du lieu tham so
	public static void hieu(double x, double y) {
		// body of method
		System.out.println(x - y);
	}
}
