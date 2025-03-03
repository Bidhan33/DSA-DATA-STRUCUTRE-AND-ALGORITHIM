package Demo;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTranslation {
public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String[] english = {"bus", "car", "cab", "house", "moon", "sun", "thanks", "train", "teacher"};
	String[] finnish = {"bussi", "auto", "taksi", "talo", "kuu", "aurinko", "kiitos", "juna", "opettaja"};

	 System.out.print("Enter an English word: ");
	 String input = scanner.next().toLowerCase();
	 
	 boolean found = false;
	 for(int i=0; i< english.length; i++) {
		 if(english[i].equals(input)) {
		 System.out.println( finnish[i]);
		 found = true;
		 break;
	 }
	 }
	 if(!found) {
		  System.out.println("Unknown word");
	 }
	 scanner.close();
	
}
}
