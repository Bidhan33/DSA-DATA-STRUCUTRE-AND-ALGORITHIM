package Demo;

public class Desi {
	public static void main(String[] args) {
		int[] number = {6, -4, 5, 3, -1, 0, 8};
		
		for(int i=0; i< number.length; i++) {
			if(number[i] > 0) {
				System.out.println(number[i] + " ");
				
			}
		}
		System.out.println();
		for(int i=0; i< number.length; i++) {
			if(number[i] < 0) {
				System.out.println(number[i] + " ");
			}
			}
	}

}
