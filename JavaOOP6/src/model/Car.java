package model;

import java.util.Scanner;
///is - a
//ke thua interface dung implements
public class Car extends Vehicle implements Root {
	private int airbagNumber;

	public int getAirbagNumber() {
		return airbagNumber;
	}

	public void setAirbagNumber(int airbagNumber) {
		this.airbagNumber = airbagNumber;
	}

	@Override //check override ham
	public void info() {
		super.info();
		System.out.println(this.airbagNumber);
	}
	
	@Override
	public void input() {
		super.input();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap tui khi:");
		airbagNumber = sc1.nextInt();
	}

	//class con fai override lai ham abstract
	//viet body cho ham
	@Override
	public void fuelConsume() {
		System.out.println("8l/100km");
	}
	
	@Override
	public void importMe() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void printMe() {
		// TODO Auto-generated method stub
		
	}
	
}
