package Demo;

import java.util.Scanner;

public class RegexSize {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter size code (XXS, XS, S, M, L, XL, XXL): ");
		String size = scanner.nextLine().trim().toUpperCase();
		
		if(size.matches("XXS|XS|S|M|L|XL|XXL")) {
			System.out.println("Size ok");
			
		}else {
			System.out.println("Invalid size");
		}
		
		
	}

}
