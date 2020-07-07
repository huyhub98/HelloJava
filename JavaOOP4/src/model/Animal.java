package model;

//https://www.youtube.com/watch?v=0qj15kodP5Q&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=45
public class Animal {
	private String name;
	private int age;
	public Food food;
	private Country coutry;
	
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Country getCoutry() {
		return coutry;
	}

	public void setCoutry(Country coutry) {
		this.coutry = coutry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
