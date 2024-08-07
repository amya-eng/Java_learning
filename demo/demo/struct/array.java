package demo.struct;

import java.util.Scanner;

public class array {
	
	public static void printArray(int[] arr) {        // array as a parameter
		for (int e: arr) {
			System.out.print(e + " ");
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		double[] arr1 = new double[3];
		arr1[0] = 0.0;
		arr1[1] = 0.1;
		arr1[2] = 0.2;
		System.out.print(arr1.length);
		System.out.print("\n");
		
		// brief method
		double[] arr2 = {0.0, 1.0, 0.2};
		
		//anonymous array
		printArray(new int[]{1,2,3});
		
		// get input-array
		Scanner input = new Scanner(System.in);
		System.out.printf("enter the length of arr:");
		int len = input.nextInt();
		int[] list = new int[len];
		for (int i = 0; i < len; i++) {
			list[i] = input.nextInt();
		}
		
		//print the array
		for (int i = 0; i < len; i++) {
			System.out.print(list[i] + " "); 
		}
		System.out.print("\n");
		// another way no index to print
		for (int e: list) {
			System.out.print(e + " ");
		}
		
		// copy the array
		System.out.print("\n");
		int[] array1 = {1,2,3,4,5};
		int[] array2 = new int[6];
		java.lang.System.arraycopy(array1, 1, array2, 1, 2);
		for (int e: array2) {
			System.out.print(e + " ");
		}
		
		// array as argv
		System.out.print("\n");
		
		int[] a1 = {1,3,2,5,4};
		int[] a2 = {0,0,0,0,0};
		java.util.Arrays.sort(a1, 0, 3);  // sort part of array
		printArray(a1);
		System.out.println(java.util.Arrays.equals(a1, a2));
		java.util.Arrays.fill(a2, 1,3,2);     // [1, 3) fill 2 to part of array
		printArray(a2);

	}
}
