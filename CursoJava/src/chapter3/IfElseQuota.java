package chapter3;

/*
 IF ELSE
 All salespeople are expected to make at least 10 sales each week.
 for those who do, they receive a congratulatory message. 
 For those who don't, they are informed of how many sales they were short
 */

import java.util.Scanner;


public class IfElseQuota {
	public static void main(String args[]) {
		
		// Initialize values we know
		int quota = 10;
		int sales = 0;
		int shortage = 0;
		
		String felicitaciones = "You've passed the quota! Contratulations!!";
		
		//Inicializar Scanner
		Scanner scanner = new Scanner(System.in);
						
		//Get unkown values
		System.out.println("Enter the number of sales you made this week");
		sales = scanner.nextInt();
		shortage = quota - sales;
		scanner.close();
		
		//Make a decision on the path to take - Output
		if(sales >= quota) {
			System.out.println(felicitaciones);
		}
		else {
			System.out.printf("Work harder! You were %d sales short.", shortage);
		}
		
	}
}
