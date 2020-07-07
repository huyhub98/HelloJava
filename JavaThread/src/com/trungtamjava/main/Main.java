package com.trungtamjava.main;

import com.trungtamjava.model.Account;

public class Main {
	public static void main(String[] args) {
		Account account = new Account();
		
		Thread t1 = new Thread(account);
		Thread t2 = new Thread(account);
		Thread t3 = new Thread(account);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
