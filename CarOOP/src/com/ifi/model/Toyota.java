package com.ifi.model;

import java.io.Serializable;
import java.util.Scanner;

import com.ifi.utils.CarConst;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Toyota extends Car implements Serializable{
	private String brand = CarConst.TOYOTA;
	private String model;


	@Override
	public String toString() {
		return "Toyota [brand=" + brand + ", model=" + model + "]";
	}

}
