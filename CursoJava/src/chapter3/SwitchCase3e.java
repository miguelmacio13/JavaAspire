package chapter3;

import java.util.Scanner;

public class SwitchCase3e {
	public static void main(String args[]) {
		
		System.out.println("Enter your letter grade:");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		grade = grade.toUpperCase();
		scanner.close();
		String message;
		
		//Switch Case
		switch(grade){
		case "A":
			message = "Excellent job";
			break;
		case "B":
			message = "Great Job";
			break;
		case "C": 
			message = "Good job";
			break;
		case "D":
			message = "You need to work a bit harder";
			break;
		case "F":
			message ="Uh oh!";
			break;
		default:
			message = "Error, invalid grade";
			break;
		}
		System.out.println(message);
	}
}
