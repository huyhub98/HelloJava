package com.quanghuy.loops;

import java.util.Scanner;

public class VongLap {
	public static void main(String[] args) {
		tinhGiaithua();
	}

	public static void CountHelloWorld() {
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("HelloWorld");
			count++;
		}
		System.out.println("Số lần in ra HelloWorld :" + count);
	}

	public static void TinhTong() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("Tổng từ 0 -> 100 là :" + sum);
	}

	public static void tinhGiaithua() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập vào số n");
		n = sc.nextInt();
		long giai_thua = 1;
		if (n == 0 || n == 1) {
			System.out.println("Giai thừa của " + n + " là :" + giai_thua);
		} else {
			for (int i = 2; i <= n; i++) {
				giai_thua *= i;
			}
			System.out.println("Giai thừa của " + n + " là :" + giai_thua);
		}
	}

	public static void Menu() {
	
		 do {
			            System.out.println("\t MENU");
			            System.out.println("1. Add New Entry");
			            System.out.println("2. Edit Entry");
			            System.out.println("3. Display list of Clients");
			            System.out.println("4. Delete entry");
			            System.out.println("5. Deposit");
			            int n = 
			            switch(option) {			 
			                case 0 :			 
			                     System.out.println("Exiting");		 
			                     break;			 
			                case 1 :			
			                     System.out.println("Adding New Entry");			
			                     break;			 
			                case 2 :			 
			                     System.out.println("Editing Entry");
			                 break;			 
			                case 3 :
			                    System.out.println("Displaying list of Clients");
			                    break;
			                case 4 :
			                    System.out.println("Deleting Entry");
			                    break ;
			                case 5 :
			                    System.out.println("Depositing");
			                    break;
			                case 6 :
			                    System.out.println("Withrawing");
			                    break;
			                default:
			                    System.out.println("Invalid Option");
			                    break;
			             }
			 
}

