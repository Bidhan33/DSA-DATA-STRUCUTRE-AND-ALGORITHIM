package Demo;
import java.util.Scanner;
import java.util.Arrays;

public class demk {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5]; 
		
		
	     for(int i=0; i< array.length; i++ ) {
	    	 System.out.println("Enter an integer: ");
	    	 array[i] = scanner.nextInt();
	    	 
	     }
	     Arrays.sort(array);
	     
	     for( int i = array.length - 1; i>=0; i--) {
	    	 System.out.println(array[i] + ' ');
	     }
	     
	     scanner.close();
		
		
		
	}

}
