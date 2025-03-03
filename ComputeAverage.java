package Demo;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ComputeAverage {
	public static void main() {
		Scanner scanner = new Scanner(System.in);
		double input;
		double sum =0;
		int count = 0;
		DecimalFormat df = new DecimalFormat("#.0");
	
		System.out.println("Enter First number: ");
		input = scanner.nextDouble();
		
		while(input !=0) {
			sum = sum + input;
			count++;
			System.out.print("Enter next number: ");
            input = scanner.nextDouble();
			
		}
		if ( count ==0) {
			System.out.println("No values");
		}else {
			String Average = df.format(sum / count).replace('.', ',');
            System.out.println("The average is " + Average);
			
		}
		
		
		
		
		
	}

}
