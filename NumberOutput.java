package Demo;
import java.util.Scanner;
public class NumberOutput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of lines to be printed: ");
		int n = scanner.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j< i +3; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
		
	

}
