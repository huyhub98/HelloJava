package model;

import com.ifi.utils.CarConst;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Vinfast extends Car implements Serializable {
	private String brand = CarConst.VINFAST;
	private String model;

	@Override
	public String toString() {
		return "Vinfast [brand=" + brand + ", model=" + model + "]";
	}

}
