package model;

import com.ifi.utils.CarConst;
import lombok.AllArgsConstructor;
import utils.CarConst;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class Audi extends Car implements Serializable{
	private String brand = CarConst.AUDI;
	private String model;

    public Audi() {
    }

    @Override
	public String toString() {
		return "Audi [brand=" + brand + ", model=" + model + "]";
	}

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Audi)) return false;
        final Audi other = (Audi) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$brand = this.brand;
        final Object other$brand = other.brand;
        if (this$brand == null ? other$brand != null : !this$brand.equals(other$brand)) return false;
        final Object this$model = this.model;
        final Object other$model = other.model;
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Audi;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $brand = this.brand;
        result = result * PRIME + ($brand == null ? 43 : $brand.hashCode());
        final Object $model = this.model;
        result = result * PRIME + ($model == null ? 43 : $model.hashCode());
        return result;
    }
}
