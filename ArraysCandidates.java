package Demo;

public class ArraysCandidates {
	public static void main(String[] args) {
		 int[][] m1 = { {1, 2, 0}, {2, 3, 4} };
		 int[][] m2 = { {3, 2, 5}, {6, 4, 3} };
		 int[][] m3 = { {1, 1, 1, 1}, {3, 2, 3, 1}, {2, 2, 2, 2} };
		 int[][] m4 = { {2, 2, 3, 3}, {2, 3, 1, 0}, {1, 2, 3, 4} };
		 printMatrixSum(m1, m2);
		 System.out.println();
		 printMatrixSum(m3, m4);
		}

}
