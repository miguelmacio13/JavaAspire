package chapter4;

import java.util.Random;

/*
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls. 
 * 1. Roll the die for the user (generate a random number btw 1 -  6 and advance the user
 * that number of spaces on the game board
 * 2. After each roll tell the user which game space they are on and how many more spaces they
 * have to go to win.
 * 3. Repeat this 4 additional times for 5 rolls in total.
 * 4. If any of players get exactly to 20 spaces, they win. Exit game
 * 5. If any player surpasses 20 before 5 rolls, game over. Also if they don't reach 20 after 5 rolls, they lose too.
 * 6. If message show that they advanced more than 20 spaces, it's a bug ("you're on space #22)
 */

import java.util.Scanner;

public class RollTheDie4d {
	public static void main(String args[]) {
		Random ran = new Random();
		Scanner scanner = new Scanner(System.in);
		
		boolean KeepPlaying = true;
    	String SKeepPlaying;

	    
		//while para preguntar si se quiere jugar de nuevo
	    while(KeepPlaying) {
	    	
			int rounds = 5;
			int goal = 20;
			int spacesToGo = 0;
			int Player = 0;
		    
	    	
	    	//Se tiran 5 rondas de dados
			for(int i=0; i<rounds && Player < goal; i++) {
				System.out.printf("Ronda %d de 5\n", i+1);
				System.out.println("Presiona \"Enter\" para tirar el dado");
				scanner.nextLine();
				int x = ran.nextInt(6) + 1;
				Player = Player + x;
				System.out.println("Avanzarás " + x + " espacios.");
				spacesToGo = goal - Player;
				if (Player < goal && i == 4){
					System.out.println("Se acabaron las rondas; te faltaron " + spacesToGo + " espacios para llegar a la meta\n");	
				}
				else if(Player == goal) {
					System.out.println("Felicidades! Llegaste justo al espacio 20");
				}
				else if(Player <goal){
					System.out.println("Necesitas " + spacesToGo + " espacios para llegar al espacio 20\n");
				}
				
				else {
					System.out.println("Lo siento, has rebasado la meta; perdiste. Game over");
				}
				
			}
			System.out.println("¿Quieres seguir jugando?");
			SKeepPlaying = scanner.next().toUpperCase();
			if(SKeepPlaying.matches("YES|Y|TRUE")){
				KeepPlaying = true;
			}
			else if(SKeepPlaying.matches("NO|N|FALSE")){
				KeepPlaying = false;
				System.out.println("Gracias por jugar. Adiós!");
			}
	    }
	    
		scanner.close();
	}
}
