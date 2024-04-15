package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
	public static void main(String arg[]) {
		//Pedir horas de trabajo
		System.out.println("Cántas horas trabajó?: ");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt(); 
		//Pedir el salario por hora:
		System.out.println("Cuánto pagan por hora?: ");
		double payRate = scanner.nextDouble();
		scanner.close();
		//Multiplicar ambos valores
		double salario = payRate * hours;
		//Mostrar resultado
		System.out.println("El salario es de: $" + salario);	
	}
}
