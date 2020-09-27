package com.ifi.utils;

import com.ifi.manager.CarManager;

public class Report extends Thread{
	CarManager subManager;
	public void run() {
		subManager = new CarManager();
		System.out.println("Program Backup");
		subManager.load();
		subManager.printReportFixedRate();
	}
}
