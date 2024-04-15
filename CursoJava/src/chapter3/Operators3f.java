package chapter3;

import java.util.Scanner;

public class Operators3f {
	public static void main(String args[]) {
		//values we know
		int Minyears = 2;
		int MinSalary = 30000;
		
		//Initialize Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Values we don't know
		System.out.println("Please enter your salary:");	
		int Salary = scanner.nextInt();
		System.out.println("Please enter the years you've worked with your current employer:");	
		int Years = scanner.nextInt();
		scanner.close();
		
		
		//Nested if and output
		if(Salary >= MinSalary && Years >= Minyears) {
			System.out.println("Congrats! You're elegible for a loan.");
			}
		else {
			System.out.println("Sorry, you don't qualify for a loan =(");
		}
	}
}
