package chapter6;

import java.util.Scanner;

public class homeAreaCalculatorRedo6b {
	
	Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		
		homeAreaCalculatorRedo6b calculator = new homeAreaCalculatorRedo6b();
		Rectangle6a kitchen = calculator.getRoom();
		Rectangle6a bathroom = calculator.getRoom();
		calculator.scanner.close();
		
		double area = calculator.calculateTotalArea(kitchen, bathroom);
		
		System.out.println("The total area is: " + area);
	}
	
	public Rectangle6a getRoom() {
		System.out.println("Enter the length of your room");
		double length = scanner.nextDouble();
		
		System.out.println("Enter the width of your room");
		double width = scanner.nextDouble();
		
		return new Rectangle6a(length,width); //Un objeto puede regresar con múltiples valores
	}
	
	public double calculateTotalArea(Rectangle6a rectangle1, Rectangle6a rectangle2) {
		return rectangle1.calculateArea() + rectangle2.calculateArea();
	}
	
}
