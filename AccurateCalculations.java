package Demo;

import java.math.BigDecimal;
import java.util.Scanner;

public class AccurateCalculations {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter first number: ");
        BigDecimal num1 = new BigDecimal(scanner.nextLine());

       
        System.out.print("Enter second number: ");
        BigDecimal num2 = new BigDecimal(scanner.nextLine());

       
        System.out.print("Enter greeting text: ");
        String greeting = scanner.nextLine();

      
        BigDecimal sum = num1.add(num2);
        BigDecimal difference = num1.subtract(num2);

      
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);


        System.out.println(greeting);

      
        scanner.close();
    }
}
