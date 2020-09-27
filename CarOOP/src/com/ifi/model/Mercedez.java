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
public class Mercedez extends Car implements Serializable{
	private String brand = CarConst.MERCEDEZ;
	private String model;

	@Override
	public String toString() {
		return "Mercedez [brand=" + brand + ", model=" + model + "]";
	}

}
