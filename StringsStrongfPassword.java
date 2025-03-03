package Demo;

import java.lang.classfile.instruction.ReturnInstruction;
import java.util.Scanner;

public class StringsStrongfPassword {
	public static boolean checkStrength(String password) {
		if(password.length() < 8) {
			return false;
		}
		int check =0;
		
		if(password.matches(".*[A-Z].*")) check++;
		  if (password.matches(".*[a-z].*")) check++;
		  if (password.matches(".*\\d.*")) check++;
		  if (password.matches(".*[!@#$%^&*()_+\\\\-=\\\\[\\\\]{};':\\\"\\\\\\\\|,.<>\\\\/?].*")) check++;
		
	
	return check >= 3;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your password: ");
		String input= scanner.nextLine();
		
		if(checkStrength(input)) {
			System.out.println("OK");
			
		}else {
			System.out.println("Not strong enough!");
		}
		
		
		
		
	}

	
}
