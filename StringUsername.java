package Demo;

import java.util.Scanner;

public class StringUsername {
	public static  String CreateUsername(String name, String surname) {
		
		name = name.toLowerCase();
		surname = surname.toLowerCase();
		
	if(name.length()< 2 || surname.length() <3){
		return null;
	}
	
	String fi = name.substring(0, 2);
	String se = surname.substring(surname.length() - 3);
	
	return se + fi ;
	
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter given name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter surname: ");
		String surname = scanner.nextLine();
		
		String result = CreateUsername(name, surname);
		
		
		
		
		
		if(result != null) {
			System.out.println(result);
		}else{
			System.out.println("Not enough letters to create a username!");
			
		}
		
	scanner.close();
	}
}
