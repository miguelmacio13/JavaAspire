package chapter4;

import java.util.Scanner;

/*
 * Each store employee makes $15 an hour. Write a program that allow to
 * enter the number of hours worked for the week. Do not allow overtime.
 */

public class WhileLoop4a {
	public static void main(String args[]) {
		
		//Variables we know
		int rate = 15;
		int maxHours = 40;
		
		//Get input for unknown variables
		System.out.println("Please, enter the total hours you worked this week: ");
		Scanner scanner = new Scanner(System.in);
		double hoursWorked = scanner.nextDouble();
		
		//Validate input
		while(hoursWorked > maxHours || hoursWorked < 1) {
			System.out.println("Invalid entry. Your hours must be between 1 and 40");
			hoursWorked = scanner.nextDouble();
		}
		
		scanner.close();
		
		//Calculate gross
		double gross = rate * hoursWorked;
		System.out.println("Gross pay: $" + gross);
	}
}
