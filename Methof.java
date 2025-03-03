package Demo;
import java.util.Scanner;

public class Methof {


  
 public static int min(int a, int b, int c) {
	 return Math.min(a, Math.min(b, c));
	 
 }
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("Enter first integer: ");
	 int a = scanner.nextInt();
	 
	 System.out.print("Enter second integer: ");
     int b = scanner.nextInt();
	 
	  System.out.print("Enter third integer: ");
     int c = scanner.nextInt();
	 
     int minValue = min(a, b, c);
     System.out.println();
    System.out.println("The min value is " + 	minValue);
    
	 
	 
	
	 
	 
 }
 
 
 
 
 
 
}