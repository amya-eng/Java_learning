package demo.Base;

public class MathFunction {
	public static void main(String[] args) {
		System.out.println(Math.sin(Math.toRadians(270)));
		System.out.println(Math.toRadians(270));
		System.out.println(Math.PI / 6);
		System.out.println(Math.asin(0.5));
		System.out.println(Math.atan(360));
		
		System.out.println("\n\n");
		System.out.println(Math.exp(3.5));
		System.out.println(Math.log(3.5));
		System.out.println(Math.log10(3.5));
		System.out.println(Math.pow(3,5));
		System.out.println(Math.sqrt(4));
		
		System.out.println("\n\n");
		System.out.println(Math.ceil(3.5));
		System.out.println(Math.floor(3.5));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.round(3.5));
	}
}
