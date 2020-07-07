package main;

import model.Animal;
import model.Country;
import model.Food;

//https://www.youtube.com/watch?v=0qj15kodP5Q&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=45
public class MainAnimal {
	public static void main(String[] args) {
		Food rice = new Food();
		rice.setFoodName("Gao VN");
		
		Country vn = new Country();
		vn.setName("VN");

		Animal dog = new Animal();
		Animal cat = new Animal();
		
		dog.setCoutry(vn);//
		System.out.println(dog.getCoutry().getName());
		
		dog.setName("Husky");
		dog.food = rice;//bac cau
		System.out.println(dog.food.getFoodName());
		
		cat.setName("?");
		cat.food = rice;//bac cau?
		
		
		System.out.println(cat.food.getFoodName());
		
		//
		rice.setFoodName("RICE");//?
		
		///dog.food va cat.food ? bi thay doi ko? - Bi thay đổi vì trỏ đến cùng đối tượng rice
		System.out.println(dog.food.getFoodName());
		System.out.println(cat.food.getFoodName());
		///
		dog.food.setFoodName("Gao"); 
		///rice, cat.food? thay doi ko? - Bi thay đổi vì trỏ đến cùng đối tượng rice
		System.out.println(rice.getFoodName());

	}
}
