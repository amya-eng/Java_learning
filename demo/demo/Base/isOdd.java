package demo.Base;

import java.util.Scanner;

public class isOdd {
	public static void main(String[] args) {
		System.out.println("input the number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num % 2 == 1) {
			System.out.println("it's a odd.");
		} else if (num == 0) {
			System.out.println("it's zero.");
		}
		else {
			System.out.println("not a odd.");
		}
	}
}
