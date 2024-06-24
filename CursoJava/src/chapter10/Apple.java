package chapter10;

public class Apple extends Fruit {
	
	public Apple(int calories) {
		this.calories = calories;
	}
	
	@Override
	public void makeJuice() {
		System.out.println("apple juice is made");
	}
	
	public void peel() {
		System.out.println("The apple is peeled");
	}
	
}
