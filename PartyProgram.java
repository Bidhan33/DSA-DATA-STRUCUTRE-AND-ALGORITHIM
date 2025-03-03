package Demo;

import java.util.Scanner;

public class PartyProgram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of candies: ");
            int firstInt = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the number of children: ");
            int secondInt = Integer.parseInt(scanner.nextLine());

             int divison = firstInt / secondInt;
             int reminder = firstInt % secondInt;
            if (reminder == 0) {
            	System.out.println();
            	System.out.println("Each child will get " + divison + " candies.");
            	
            	System.out.println("There will be no leftover candies.");
            } else {
               System.out.println("Each child will get " + divison + " candies.");
            	
            	System.out.println("There will be " + reminder +" leftover candies.");
                
            }
        }
    }
}
