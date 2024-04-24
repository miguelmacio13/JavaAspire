package chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to repeat this action until they indicate they are done.
 */

public class DoWhileLoop4b {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		boolean again = false;
		do {
			System.out.println("Enter your first number");
			double num1 = scanner.nextDouble();
			System.out.println("Enter your second number");
			double num2 = scanner.nextDouble();
			
			double suma = num1 + num2;
			System.out.println("The sum up between your numbers is: " + suma);

			//loop until valid answer
			String YesNo;
			do {
				System.out.println("Would you like to do another sum? (True/False)");
				YesNo = scanner.next().toUpperCase();
				
				if (YesNo.matches("YES|TRUE|Y")){
					again = true;
				}
				else if (YesNo.matches("NO|FALSE|N")) {
					again = false;
				}
				else {
					System.out.println("Not valid");
					YesNo = "perro";
				}
			} while(YesNo.equals("perro"));
			

		} while(again);
		scanner.close();
		System.out.println("Thank you for using my program");
	}
}
