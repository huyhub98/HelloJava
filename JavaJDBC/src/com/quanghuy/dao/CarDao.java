package com.quanghuy.dao;

import java.util.List;

import com.quanghuy.model.Car;

public interface CarDao {
	void create(Car car);

	void update(Car car);

	void delete(int id);

	Car getId(int id);

	List<Car> search(String name);

	List<Car> search(double fromPrice, double toPrice);

	List<Car> searchByManufacture(String manufacture);

	long getCarAmount();
	long totalPrice();
	Car getMaxPrice();
}
