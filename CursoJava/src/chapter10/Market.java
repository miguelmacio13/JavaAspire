package chapter10;

public class Market {
	public static void main(String args[]) {
		Fruit appleJuice = new Apple(350);
		((Apple) appleJuice).peel();
		appleJuice.makeJuice();
		printCal(appleJuice.calories);
		
		
		
		Fruit bananaJuice = new Banana(200);
		((Banana) bananaJuice).peel();
		bananaJuice.makeJuice();
		printCal(bananaJuice.calories);
		
		
		
	}
	
	static void printCal(int calories) {
		System.out.println("The calories in this juice are: " + calories);
	}
	
}
