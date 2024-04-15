package chapter3;

/*
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class NestedIfLoan {
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
		if(Salary >= MinSalary) {
			if(Years >= Minyears) {
				System.out.println("Congrats! You're elegible for a loan.");
			}
			else {
				System.out.println("Sorry, you don't qualify for a loan =( you lack years at current job");
			}
		}
		else {
			System.out.println("Sorry, you don't qualify for a loan =( you need a greater salary");
			
		}
	}	
}
