package Demo;

import java.util.Scanner;

public class PercentageChange {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter x: ");
            int firstInt = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter y: ");
            int secondInt = Integer.parseInt(scanner.nextLine());

            // Check if secondInt is zero
            if (secondInt == 0) {
                System.out.println("Cannot divide " + firstInt + " by zero.");
                System.out.println("The remainder of 0 / " + firstInt + " is 0");
            } else {
                // Calculate remainders
                int d1 = firstInt % secondInt;
                
                // Check if firstInt is zero to avoid division by zero
                if (firstInt == 0) {
                    System.out.println("The remainder of " + secondInt + " / " + firstInt + " cannot be calculated.");
                } else {
                    int d2 = secondInt % firstInt;
                    System.out.println("The remainder of " + secondInt + " / " + firstInt + " is " + d2);
                }

                // Even/Odd check for firstInt
                if (firstInt % 2 == 0) {
                    System.out.println(firstInt + " is even");
                } else {
                    System.out.println(firstInt + " is odd");
                }

                // Even/Odd check for secondInt
                if (secondInt % 2 == 0) {
                    System.out.println(secondInt + " is even");
                } else {
                    System.out.println(secondInt + " is odd");
                }

                // Print remainder of firstInt / secondInt
                System.out.println("The remainder of " + firstInt + " / " + secondInt + " is " + d1);
            }
        }
    }
}
