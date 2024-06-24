package chapter8;

import java.util.Scanner;

public class wrappedClass8b {
	private static Scanner scanner = new Scanner(System.in);
	private static String sentence;
	
	public static void main(String args[]) {
		
		//Get the sentence to look for
		sentence = getSentence();
		countWords(sentence);
		printWords(sentence);
		scanner.close();
	}
	
	public static String getSentence() {
		System.out.println("Please, write a sentence and hit Enter: ");
		String sentence = scanner.nextLine();
		return  sentence;
	}
	
	public static void countWords(String Sentence) {
		var words = Sentence.split(" ");
		int numberOfWords = words.length;
		System.out.println("Your sentence has: " + numberOfWords + " words");
	}
	
	public static void printWords(String Sentence) {
		var words = Sentence.split(" ");
		for(String word : words) {
			System.out.println(word);
		}
	}
}
