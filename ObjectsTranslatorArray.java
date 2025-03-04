package Demo;

import java.io.FileNotFoundException;
import java.util.Scanner;

class WordPair{
	private String english;;
	private String finnish;
	
	
	
	public WordPair(String english, String finnish) {
		this.english = english;
		this.finnish = finnish;
		
		
		
	}

	public String getEnglish() {
		return english;
	}



	public String getFinnish() {
		return finnish;
	}
	
}


public class ObjectsTranslatorArray {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		WordPair[]  wordPairs = {new WordPair("bird", "lintu"),
				new WordPair("bar", "baari"),
	            new WordPair("bus", "bussi"),
	            new WordPair("car", "auto"),
	            new WordPair("cat", "kissa"),
	            new WordPair("dog", "koira")
				
	          
	};
		
		System.out.print("Enter english word: ");
		String inputString = scanner.nextLine().toLowerCase();	
		
		boolean found = false;
		
		
		for(int i = 0; i< wordPairs.length; i++) {
			if(wordPairs[i].getEnglish().equals(inputString)){
				System.out.println(wordPairs[i].getFinnish());
				found = true;
				break;
				
			}
		}
		
		if(!found) {
			System.out.println("Unknown word");
		}

}
}

