package Demo;
import java.util.Scanner;

public class UpDownSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

     
        if (n > 0) {
        	int count = 2 *n - 1;
            System.out.println();
            System.out.print("The sequence contains the following " + count + " integer(s): ");
        	for (int i = 1; i <= n; i++) {
        	    System.out.print(i + " ");
            }
          
            for (int i = n - 1; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }

       
        scanner.close();
    }
}

