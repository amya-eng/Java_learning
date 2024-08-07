package demo.struct;

public class Matrix {
	
	public static void printM(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for( int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		// create the matrix
		int[][] m1 = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		int[][] m2 = new int[5][5];
		
		// assignment
		m2[0][4] = 4;
		
		System.out.println("the len of m1: " + m1.length);
		System.out.println("the len of m1[1]: " + m1[1].length);
		
		//ragged array 不规则数组
		int[][] raggedArray = new int[5][];
		raggedArray[0] = new int[5];
		raggedArray[1] = new int[4];
		raggedArray[2] = new int[3];
		raggedArray[3] = new int[2];
		raggedArray[4] = new int[1];
		
		// operations on matrix
		int[][] matrix = new int[3][3];
		int[][] random = new int[10][10];
		
		//input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("enter " + matrix.length + " rows and " + matrix[0].length + " cols :");
		for (int i = 0; i < matrix.length; i++) {
			for( int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		//random
		for (int i = 0; i < matrix.length; i++) {
			for( int j = 0; j < matrix[0].length; j++) {
				random[i][j] = (int) (Math.random() * 10);
			}
		}
		
		//output
		printM(matrix);
		printM(random);
		
		//n-dim array
		double[][][] scores = {
				{{1,2,3}, {2,3,4}}
		};
	}
}
