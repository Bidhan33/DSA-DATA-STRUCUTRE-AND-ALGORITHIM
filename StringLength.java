 package Demo;
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        String input = "";
        int totalLength = 0;

      
        System.out.print("Enter first string: ");
        while (!input.equals("quit")) {
        	
        	
            input = scanner.nextLine(); 
            if (!input.equals("quit")) {
                totalLength += input.length(); 
                System.out.print("Enter next string: ");
                
            }
        }

         System.out.println();
        System.out.println( totalLength +" characters");

       
        scanner.close();
    }
}
