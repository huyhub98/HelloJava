package com.ifi.utils;

import com.ifi.manager.CarManager;

public class Report extends Thread{
	CarManager subManager = new CarManager();
	public void run() {
		System.out.println("Program Backup");
		subManager.load();
		subManager.printReportFixedRate();
	}
}
