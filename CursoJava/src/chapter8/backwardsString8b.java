package chapter8;


public class backwardsString8b {
	public static void main(String args[]) {
		String sentence = wrappedClass8b.getSentence();
		reverseString(sentence);
		
		
	}
		
	public static void reverseString(String Sentence) {
		for(int i = Sentence.length() - 1; i >= 0; i--) {
			System.out.print(Sentence.charAt(i));
		}
	}
	
}
