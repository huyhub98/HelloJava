package model;

import com.ifi.utils.CarConst;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Mercedez extends Car implements Serializable{
	private String brand = CarConst.MERCEDEZ;
	private String model;

	@Override
	public String toString() {
		return "Mercedez [brand=" + brand + ", model=" + model + "]";
	}

}
