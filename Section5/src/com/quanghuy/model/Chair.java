package com.quanghuy.model;

public class Chair {
	private String name;
	private int price;
	private String color;

	public Chair() {
		super();
	}

	public Chair(int price) {
		super();
		this.price = price;
	}

	public Chair(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Chair(int price, String name, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void chairInfo() {
		System.out.println("Tên Ghế: " + this.getName());
		if (price > 0) {
			System.out.println("Giá: " + this.getPrice() + " VNĐ");
		} else {
			System.out.println("Giá Không Hợp Lệ");
		}
		System.out.println("Màu: " + this.getColor());
	}
}
