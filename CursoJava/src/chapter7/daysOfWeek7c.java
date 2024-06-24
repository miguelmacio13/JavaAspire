package chapter7;

import java.util.Scanner;

public class daysOfWeek7c {
	private static Scanner scanner = new Scanner(System.in);
	private static String diasSemana[] = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
	private static int diaInt = 0;
	public static void main(String args[]) {
		
		
		dayInput();
		dayOutput(diaInt);
	}
	
	public static int dayInput() {
		
		System.out.println("Indica con entero del 1 al 7 qué día de la semana es: ");
		diaInt = scanner.nextInt();
		return diaInt;
	}
	
	public static void dayOutput(int diaInt) {
		
		System.out.println("El día de la semana es " + diasSemana[diaInt - 1]);
	}
}
