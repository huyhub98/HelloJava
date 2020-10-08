package com.ifi.test;

import com.ifi.dao.BrandDao;
import com.ifi.dao.BrandDaoImpl;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.ifi.manager.CarManager;
import com.ifi.model.CarBrand;
import com.ifi.utils.Report;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static CarManager manager = new CarManager();
    public static BrandDao brandDao = new BrandDaoImpl();
    public static CarBrand carBrand = new CarBrand();
    public static List<CarBrand> carBrands = new ArrayList<CarBrand>();
    
    public static void main(String[] args) {
       
       
        //reportTopFive();
        //CarManager.menu();
               
    }

    public static void reportTopFive() {
        Report report = new Report();
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleWithFixedDelay(report, 0, 10, TimeUnit.SECONDS);
    }
}
