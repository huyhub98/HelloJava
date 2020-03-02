package toanhoc;

public class StringFormat {
	public static void main(String[] args) {
		int x = 10;
		int y = 11;
		int tong = x + y;
		int hieu = x - y;
		int tich = x * y;
		float thuong = (float) x / y;
		String s1 = "tổng của " + x + " và " + y + " là: " + tong;
		String s2 = "tích của " + x + " và " + y + " là: " + tich;
		String s3 = "thương  của " + x + " và " + y + " là: " + thuong;
		String s4 = "hiệu của " + x + " và " + y + " là: " + hieu;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
