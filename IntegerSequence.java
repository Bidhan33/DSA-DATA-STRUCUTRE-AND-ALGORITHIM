package Demo;

import java.util.Scanner;

public class IntegerSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String input = scanner.nextLine(); // Read input as a string

        // Check if the input is empty
        if (input.isEmpty()) {
            return; // Exit if no input
        }

        int number = Integer.parseInt(input); // Parse the input to an integer

        if (number <= 0) {
            // Print decreasing sequence
            for (int i = number; i <= 1; i++) {
                System.out.print(i + " ");
            }
            // Print increasing sequence
            for (int i = 2; i <= Math.abs(number); i++) {
                System.out.print(i + " ");
            }
        }
    }
}
