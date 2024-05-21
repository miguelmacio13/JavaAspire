package chapter5;

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets then by name.
 */

public class greetingsMethode5a {

	public static void main(String args[]) {
		System.out.println("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		greetUser(name);
		scanner.close();
	}
	
	//All methods should be contain within the skull of a class
	
	public static void greetUser(String name) {
		System.out.println("Hi there, " + name);
	}
}
