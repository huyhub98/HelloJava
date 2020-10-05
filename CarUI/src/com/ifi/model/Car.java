package com.ifi.model;

import java.io.Serializable;

/**
 *
 * @author mac
 */
public class Car implements Serializable {
        private static final long serialVersionUID = 6941744511642207951L;
	private int id;
	private String name;
	private long price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
	
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
