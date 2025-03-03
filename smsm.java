package Demo;
import java.util.Scanner;
public class smsm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String alp[] =  {"A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "A", "C", "C", "C"};
		
		
		System.out.println("Enter a grade letter (A, B, C, or F): ");
		String input = scanner.next().toUpperCase();
		
		
		int count =0;
		for( int i=0; i< alp.length; i++) {
			if(alp[i].equals(input)) {
			count++;
		}
		}
		
		double per = (double)count / alp.length * 100;
	    System.out.printf("The percentage of grade '%s' is: %.2f%%\n", input, per);

        scanner.close();

		
	}
	

}
