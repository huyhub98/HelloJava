package com.quanghuy.model;

public class Laptop {
	String name;
	String manufacture;
	int price;

	public Laptop() {
		super();
	}

	public Laptop(String name, String manufacture, int price) {
		super();
		this.name = name;
		this.manufacture = manufacture;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void info() {
		System.out.println("Tên máy: " + this.getName());
		System.out.println("Nhà sản xuất: " + this.getManufacture());
		if (price > 0) {
			System.out.println("Giá: " + this.price + " VNĐ");
		} else {
			System.out.println("Giá Không Hợp Lệ");
		}
	}

}
