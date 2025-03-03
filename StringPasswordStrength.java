package Demo;

import java.util.Scanner;

public class StringPasswordStrength {
	
	public static boolean checkStrength(String name, String pass) {
		if(pass.length() < 9) {
			return false;
		}
		if (name.toLowerCase().contains(name.toLowerCase())) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter passwor: ");
		String pass = scanner.nextLine();
		
		boolean found = checkStrength(name, pass);
		if (found) {
			System.out.println("ok");
			
		}else {
			System.out.println("Not ok ");
		}
		
		
	}

}
