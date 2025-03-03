package Demo;

import java.util.Scanner;

public class MethodsNumbers {

  
 public static double calculation(double price, double sp) {
	 double discount = ((price - sp) / price) * 100;
	 return discount;
 }
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Enter list price: ");
	 double listPrice = scanner.nextDouble();
	 
	 System.out.print("Enter selling price: ");
     double sellingPrice = scanner.nextDouble();
     
    System.out.printf("The discount percentage is %.2f %%\n", calculation(listPrice, sellingPrice));
     
	 
	 
	 
	 
	 
 }
 
 
 
 
 
 
}