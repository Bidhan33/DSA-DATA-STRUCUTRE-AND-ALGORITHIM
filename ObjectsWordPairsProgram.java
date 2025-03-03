package Demo;

import java.util.Iterator;

class Wordpair{
	private String englishWord;
	private String finnishWord;
	
	public Wordpair(String englishWord, String finnishWord ) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;
		
	}
	
	
	
	public String getEnglishWord() {
		return englishWord;
	}
	public String getFinnishWord() {
		return finnishWord;
	}



	
	public String toString() {
		return englishWord + " = " + finnishWord ;
		
	}
	
	
}


public class ObjectsWordPairsProgram {
	public static void main(String[] args) {
		Wordpair [] wordpairs = {
				new Wordpair("school", "koulu"),
				new Wordpair("student", "opiskelija"),
				new Wordpair("textbook", "oppikirja")
				};
		for(int i=0; i<  wordpairs.length; i++) {
			System.out.println(wordpairs[i]);
		}

}
}
