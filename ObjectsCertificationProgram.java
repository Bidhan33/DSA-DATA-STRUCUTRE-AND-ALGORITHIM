package Demo;

import java.util.Scanner;

class Coach {
	private String name;
	private int score;
	
	public Coach(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
}

public class ObjectsCertificationProgram {
	public static void main(String[] args) {
		Coach[] coaches = new Coach[4];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
		
		System.out.print("Enter coach name: ");
		String name = scanner.nextLine();
		System.out.print("Enter " + name + " score: ");
		int score = scanner.nextInt();
	    scanner.nextLine();
	    coaches[i] = new Coach(name, score);
		}
		
		System.out.print("Enter the minimum passing score: ");
		int pass = scanner.nextInt();
		System.out.println();
		System.out.println("Passing scores");
		for(int i=0; i< 4; i++) {
			if(coaches[i].getScore()>= pass) {
				System.out.println(coaches[i].getName() + " (" + coaches[i].getScore() + ")" );
			}
		}
		
	}

}
