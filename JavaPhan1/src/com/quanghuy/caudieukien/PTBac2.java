package com.trungtamjava.caudieukien;


//https://www.youtube.com/watch?v=B7UG7beyfSw&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=30&t=261s
public class PTBac2 {
	
	public static void main(String[] args) {
		giaiPTB2(5, 3, 1);
	}

	// ax2 + bx + c = 0
	public static void giaiPTB2(int a, int b, int c) {
		if (a != 0) {
			/// tinh delta
			int delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("Vo nghiem");
			} else if (delta == 0) {
				double x = -b / (double) (2 * a);
				System.out.println("Nghiem kep: " + x);
			} else {
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				
				System.out.println("x1: " + x1);
				System.out.println("x2: " + x2);
			}
		} else {

		}
	}
}
