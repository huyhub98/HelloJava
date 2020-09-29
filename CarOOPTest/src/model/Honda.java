package model;

import com.ifi.utils.CarConst;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Honda extends Car implements Serializable{
	private String brand = CarConst.HONDA;
	private String model;

	@Override
	public String toString() {
		super.toString();
		return "Honda [brand=" + brand + ", model=" + model + "]";
	}



}
