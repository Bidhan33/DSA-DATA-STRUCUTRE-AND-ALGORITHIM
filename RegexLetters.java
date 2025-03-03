package Demo;

import java.util.Scanner;

public class RegexLetters {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = scanner.nextLine().trim().toLowerCase();
		
		if(input.matches("[aeiouyäö]+")){
			System.out.print("Vowels only");			
		} else {
			System.out.print("Not only vowels");
			
		}
	}

}
