package demo.Base;

import java.util.Scanner;

public class max_3 {
	public static void main(String[] args) {
		double a, b, c;
		System.out.println("input three numbers:");
		Scanner scanner= new Scanner(System.in);
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		double max = a > b? a: b;
		max = max > c? max: c;
		System.out.println("the max of them: " + max);
		
		// format IO
		double m = 3.3;
		System.out.printf("the max of them: %4.2f", m); // 3.30 the effective number includes dot.
		System.out.println("\n");
		System.out.printf("string: %s, num: %d", "hello", 3);
		// print不换行
	}
}
