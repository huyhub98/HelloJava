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
public class Vinfast extends Car implements Serializable {
	private String brand = CarConst.VINFAST;
	private String model;

	@Override
	public String toString() {
		return "Vinfast [brand=" + brand + ", model=" + model + "]";
	}

}
