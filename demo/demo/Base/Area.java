package demo.Base;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		double radius;
		double area;
		System.out.println("Input the value of radius: ");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		area = PI * radius * radius;
		System.out.println(radius + " equals to " + area);

	}

}
