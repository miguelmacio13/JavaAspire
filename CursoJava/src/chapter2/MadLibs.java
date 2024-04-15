package chapter2;

import java.util.Scanner;

public class MadLibs {
	public static void main(String arg[]) {
		System.out.println("Por favor, ayúdeme a completar la siguiente frase:");
		System.out.println("On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee.");
		
		//Se inicializa el scanner
		Scanner scanner = new Scanner(System.in);
		
		//Se piden y se guardan las variables necesarias para la oración
		System.out.println("Escriba un adetivo en inglés:");
		String adjetivo = scanner.next();
		System.out.println("Escriba una temporada del año en inglés:");
		String temporada = scanner.next();
		System.out.println("Escriba un número entero:");
		int numero = scanner.nextInt();
		
		//Se arma la nueva oración
		
		System.out.println("On a " + adjetivo + " " + temporada + " day, I drink a minimum of " + numero + " cups of coffee.");	
	}
}
