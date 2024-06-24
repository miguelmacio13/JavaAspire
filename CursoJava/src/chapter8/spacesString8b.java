package chapter8;

/*
 * Add spaces to a String that has no spaces between words; each word starts with
 * a capital letter. 
 */

public class spacesString8b {
	public static void main(String args[]) {
		String sentence = wrappedClass8b.getSentence();
		addSpaces(sentence);

	}
	
	
	public static void addSpaces(String Sentence) {
		var sentenceMod = new StringBuilder(Sentence);
		
		for (int i = 0; i < sentenceMod.length(); i++) {
			if(i != 0 && Character.isUpperCase(sentenceMod.charAt(i))) {
				sentenceMod.insert(i, " ");
				i++;
			}
		}
		System.out.println(sentenceMod);
	}
}
