package com.ifi.model;

import java.io.Serializable;
import java.util.Scanner;

import com.ifi.utils.CarConst;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Audi extends Car implements Serializable{
	private String brand = CarConst.AUDI;
	private String model;

	@Override
	public String toString() {
		return "Audi [brand=" + brand + ", model=" + model + "]";
	}

}
