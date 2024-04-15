package chapter3;

import java.util.Scanner;
import java.math.BigDecimal;

public class ChangeCoing3f {
	public static void main(String args[]) {
		//Values we know
		double penny = 0.01d;
		double nickle = 0.05d;
		double dime = 0.1d;
		double quarter = 0.25d;
		double dollar = 1d;
		
		//Get Values we don't know
		System.out.println("You should give me different amount of change (penny, nickles, dimes and quarters.\nIf the combination gives me a total of $1, you win.");
		System.out.println("Please enter a quantity of pennies");
		Scanner scanner = new Scanner(System.in);
		double PQnt = scanner.nextInt();
		System.out.println("Please enter a quantity of nickles");
		double NQnt = scanner.nextInt();
		System.out.println("Please enter a quantity of Dimes");
		double DQnt = scanner.nextInt();
		System.out.println("Please enter a quantity of Quarters");
		double QQnt = scanner.nextInt();
		scanner.close();
		
		//Multiply, condition and output
		
		double TQnt = (PQnt * penny)+(NQnt * nickle)+(DQnt * dime)+(QQnt * quarter);
		BigDecimal changeR = RestaBigDecimal(dollar,TQnt);
		System.out.println(dollar);
		System.out.println(TQnt);
		System.out.println(changeR);
		double change = changeR.doubleValue();
		
		if (changeR.equals(0)) {
			System.out.println("Nice! You got exactly $1");
		}
		else if (change < 0){
			System.out.println("Try again! You were $" + changeR.abs() + "above the $1");
		}
		else {
			System.out.println("Try again! You were $" + changeR + "short from the $1");
			}
			
	}
	private static BigDecimal RestaBigDecimal(double dollar, double TQnt) {
		BigDecimal change = BigDecimal.valueOf(dollar).subtract(BigDecimal.valueOf(TQnt));
		System.out.println(change);
		return change;
		
	}
}

