package Demo;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SmallestAndLargest {
    private static double parseDouble(String input) {
        input = input.replace(',', '.');
        return Double.parseDouble(input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input;
        double min = Double.MAX_VALUE; 
        double max = Double.MIN_VALUE; 
        int count = 0;

        System.out.print("Enter first number: ");
        input = parseDouble(scanner.nextLine());

        while (input != 0) {
            
            if (input < min) {
                min = input;
            }
            if (input > max) {
                max = input;
            }
            
            count++; 
            System.out.print("Enter next number: ");
            input = parseDouble(scanner.nextLine());
        }

        if (count == 0) {
            System.out.println();
            System.out.println("No values");
        } else {
            System.out.println();
            System.out.println("The values are between " + (int)min + " and " + (int)max);
        }

        scanner.close();
    }
}
