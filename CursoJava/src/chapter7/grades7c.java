package chapter7;

import java.util.Scanner;

public class grades7c {
	private static int grades[];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("How many grades would you like to enter?");
		grades = new int[scanner.nextInt()];
		System.out.println("grades must be integers between 0 and 100");
		getGrades();
		scanner.close();
		sumGrades();
		System.out.println("Average grade is: " + String.format("%.2f", calcAverage()));
		System.out.println("Max value is: " + valorMax());
		System.out.println("Min value is: " + valorMin());

	}
	
	public static void getGrades() {
		for (int i=0; i<grades.length; i++){
			System.out.println("Please enter the grade # " + (i+1) );
			grades[i] = scanner.nextInt();
			}
		
		}
		
	public static int sumGrades() {
		int suma = 0;
		for (int grade : grades) {
			suma += grade;
		}
		return suma;

	}
	
	//Average method
	public static double calcAverage() {
		return sumGrades()/(double)grades.length;
	}
	
	public static int valorMax() {
		int valorMax = grades[0];
		for (int grade : grades) {
			if (grade > valorMax) {
				valorMax = grade;
			}
		}
		return valorMax;
	}
	
	
	public static int valorMin() {
		int valorMin = grades[0];
		for (int grade : grades) {
			if (grade < valorMin) {
				valorMin = grade;
			}
		}
		return valorMin;
	}
	
}
