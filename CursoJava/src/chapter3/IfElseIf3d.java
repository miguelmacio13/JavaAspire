package chapter3;

import java.util.Scanner;

public class IfElseIf3d {
	public static void main(String args[]) {
		//Get the test score
		System.out.println("Enter your score:");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		scanner.close();
		
		//Map score with score letters
		char grade; //Declare character variable without giving value
		
		if(score < 60) {
			grade = 'F';
		}
		else if(score < 70) {
			grade = 'D';
		}
		else if(score < 80) {
			grade = 'C';
		}
		else if(score < 90) {
			grade = 'B';
		}
		else{
			grade = 'A';
		}
		System.out.println("Your grade is: " + grade);
	}
}
