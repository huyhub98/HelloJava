package com.ifi.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.ifi.manager.CarManager;
import com.ifi.utils.Report;

public class Main {
	
	static CarManager manager = new CarManager();
	
	public static void main(String[] args) {
		//reportTopFive();
		CarManager.menu();
	}
	
	public static void reportTopFive() {
		Report report = new Report();
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		scheduler.scheduleWithFixedDelay(report, 0, 10, TimeUnit.SECONDS);
	}
}
