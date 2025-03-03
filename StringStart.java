package Demo;

import java.util.Scanner;

public class StringStart {
      public static void main(String[] args) {
    	  Scanner scanner = new Scanner(System.in);
    	  System.out.print("Enter a string: ");
    	  String input = scanner.nextLine();
    	     int letter = 0, digits =0, charc =0;
    	     for(int i=0; i<input.length(); i++) {
    	    	 char c = input.charAt(i);
    	    	 if(Character.isLetter(c)) {
    	    		 letter++;
    	    	 } else if (Character.isDigit(c)) {
    	    		 digits++;
    	    	 } else {
					charc++;
				
				}
    	    	 }
    	     
    	  System.out.println(letter + " letter(s)");
    	  System.out.println(digits + " digit(s)");
    	  System.out.println(charc + " other character(s)");
    			  
      }

}
