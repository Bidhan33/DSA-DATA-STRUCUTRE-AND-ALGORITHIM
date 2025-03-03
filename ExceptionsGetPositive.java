package Demo;
import java.util.Scanner;
public class ExceptionsGetPositive {
	public static void main(String[] args) {
		int num =0;
		try {
		System.out.print("Enter a positive integer: ");
		Scanner scanner = new Scanner(System.in);
		 num = scanner.nextInt();
		 
		if(num > 0) {
		   System.out.println("OK");
		}else if(num == 0) {
			System.out.println("0 is not a positive integer");
		}else {
			System.out.println("Please enter a positive integer!");
		}
		}catch (Exception e) {
		      System.out.println("' " + num + " '" + "is not a positive integer");
	    }
		
		
	}

}
