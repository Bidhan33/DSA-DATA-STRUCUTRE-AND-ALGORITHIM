package Demo;
import java.util.Scanner;
public class WordCounting {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter first word:");
	String firstword = scanner.nextLine().trim().toLowerCase();
	
	if(firstword.equals("quit")){
		System.out.println();
		System.out.println("No words");
		scanner.close();
		return;
	}
	int count = 0;
	
	boolean check = true;

    while (check) {
        System.out.print("Enter next word: ");
        String nextword = scanner.nextLine().trim().toLowerCase();


        check = !nextword.equals("quit");

        if (nextword.equals(firstword)) {
            count++;
        }
    }
	System.out.println();
	System.out.println("The word '" + firstword + "' occurred " + (count + 1) + " times.");
    scanner.close();
		
	}
	
}
