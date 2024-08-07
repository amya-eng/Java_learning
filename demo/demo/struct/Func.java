package demo.struct;

public class Func {
	public static int sum(int i1, int i2) {  // public static is modifier, int is return type
		int result = 0;
		for (int i = i1; i <= i2; i++) {
			result += i;
		}
		return result;
	}
	
	public static void swap(int a, int b) {
		int swp = a;
		a = b;
		b = swp;
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println("sum from 1 to 10 is " + sum(1, 10));
		
		System.out.println("a = " + a + "; b = " + b);
		System.out.println("after swaping: ");
		swap(a, b);
		System.out.println("a = " + a + "; b = " + b);     // no change
		
	    /*  The meaning of modular code is to separate the printing 
		*	and problem-solving parts into two functions, 
		*	where the printing function is an encapsulated function.
		*/
		
		/* Method overloading requires differentiating by parameter types 
		 * or their order; otherwise, it will result in an error.
		 */
		
		
	}
}
