package java.ex;

public class Dog {
	protected String color;
	protected String name;
	protected String breed;
	protected void eatting(String phuongthuc) {
		System.out.println("defalut"+phuongthuc);
	}
	protected void wagging(String phuongthuc) {
		System.out.println("defalut"+phuongthuc);
	}
	protected void barking(String phuongthuc) {
		System.out.println("defalut"+phuongthuc);
	}
	public Dog(String color, String name, String breed) {
		super();
		this.color = color;
		this.name = name;
		this.breed = breed;
	}


}
