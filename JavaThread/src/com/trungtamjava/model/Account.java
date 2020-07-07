package com.trungtamjava.model;

///tk ngan hang
public class Account implements Runnable {
	private int balance = 1000;

	@Override
	public void run() {
		withdraw();
	}

	//dong bo ham
	public synchronized void withdraw() {
		try {
			balance = balance - 1000;

			System.out.println(Thread.currentThread().getName());
			Thread.sleep(3000);// 3s
			
			if (balance < 0) {
				System.out.println("Het tien");
			} else {
				System.out.println("OK");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
