package chapter7;

import java.util.Arrays;
import java.util.Random;

public class arrays7a {
	public static void main(String args[]) {
		
		//Inicializar array con espacio para 69 tickets
		int[] lotteryTicket = new int[6];
		int randomValue;
		
		//Inicializar objeto random para poder utilizarlo como método
		Random random = new Random();
		
		for (int i=0; i < 6; i++) {
//			randomValue = random.nextInt(1, 70);
			do {
				randomValue = random.nextInt(1, 70);
			}
			while(search(lotteryTicket, randomValue));
			lotteryTicket[i] = randomValue;
			}
		
			
		
		
		for (int i=0; i < 6; i++) {
			System.out.print(lotteryTicket[i] + " | ");

		}
	}
	
	
	public static boolean search(int[] array, int numberToSearchFor) {
		
		//con este for (llamado enhanced loop) se utiliza para que se haga una iteración secuencial del array, dándole un valor por cada iteración
		for(int value : array) { // "value" será el valor de la posición de array por cada iteración
			if(value == numberToSearchFor) {
				System.out.println("número repetido; buscando nuevo");
				return true;
			}
			
		}
		
		//si el código llega aquí, entonces no se encotró duplicado
		return false;
	}
}
