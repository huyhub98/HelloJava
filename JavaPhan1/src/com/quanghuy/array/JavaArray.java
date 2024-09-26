package com.trungtamjava.array;

import java.util.Scanner;

//https://www.youtube.com/watch?v=Gu2zQyYoDHc&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=22&t=2s
public class JavaArray {
	public static void main(String[] args) {
		arrayExam();
	}
	
	public static void arrayExam() {
		int x0 = 1;
		int x1 = 2;
		int x2 = 20;
		//....
		int[] mangX = new int[5];
		mangX[0] = 1;
		mangX[1] = 2;
		int tong = mangX[0] + mangX[1];
		
		///
		double[] numbers = new double[3];
		////double numbers[0],numbers[1],...
		
		Scanner sc1 = new Scanner(System.in);
		numbers[0] = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		numbers[1] = sc2.nextDouble();
		
		Scanner sc3 = new Scanner(System.in);
		numbers[2] = sc3.nextDouble();
		
		double max = numbers[0];
		if (max < numbers[1]) {
			max = numbers[1];
		}
		if (max < numbers[2]) {
			max = numbers[2];
		}
		System.out.println("Max: " + max);
	}
}
