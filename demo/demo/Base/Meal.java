package demo.Base;

import java.util.Scanner;

public class Meal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char continueLoop = 'Y';
		
		while (Character.toUpperCase(continueLoop) == 'Y') {
			// generate two random numbers
			int n1 = (int) System.currentTimeMillis() % 10;
			int n2 = (int) System.currentTimeMillis() / 10 % 10;
			
			System.out.println(n1 + " plus " + n2 + " equal to :");
			
			int n3 = input.nextInt();
			System.out.println("It's " + (n1 + n2 == n3));
			
			System.out.println("\'Y\' to continue, \'N\' to quit:");
			input.nextLine(); // remove the '\n' 
			continueLoop = input.nextLine().charAt(0);
		}
	}
}
