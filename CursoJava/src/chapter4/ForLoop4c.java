package chapter4;

/*
 * Write a cashier program that will scan a given number of items and tally the cost
 */
import java.util.Scanner;

public class ForLoop4c {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Cuántos items le gustaría sumar?");
		int quantity = scanner.nextInt();
		
		double total = 0;
		
		for(int i=0; i<quantity; i++) {
			System.out.println("Por favor escriba el precio de su producto #" + (i+1) + ", por favor:");
			double price = scanner.nextDouble();
			total = total + price;
			
		}
		
		scanner.close();
		System.out.println("El total de su cuenta es: $" + total);
	}
	
}
