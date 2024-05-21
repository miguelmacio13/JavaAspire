package chapter4;

/*
 * Buscar en un string alguna letra en específico; 
 * salir del loop for una vez encontrada
 */

import java.util.Scanner;

public class ForLoop4c2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		//Pedir una oración para buscar una letra:
		System.out.println("Por favor, escriba una oración:");
		String oracion = scanner.next();
		boolean bingo = false;
		
		for(int i = 0; i<oracion.length(); i++) {
			char letra = oracion.charAt(i);
			if(letra == 'A' || letra == 'a') {
				bingo = true;
				break;
			}
			
		}
		
		if(bingo) {
			System.out.println("La oración contiene la letra a");
		}
		else {
			System.out.println("No existe la letra a en esta oración");
		}
	}
}
