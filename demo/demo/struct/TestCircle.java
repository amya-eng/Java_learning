/* to declare static variables and static method*/
package demo.struct;

public class TestCircle {
	public static void main(String[] args) {
		System.out.println(Circle.numberOfObject);
		
		Circle c1 = new Circle();
		System.out.println("c1: " + c1.radius + " " + c1.numberOfObject);
		
		c1.radius = 9;
		Circle c2 = new Circle();
		System.out.println("c1: " + c1.radius + " " + c1.numberOfObject);
		System.out.println("c2: " + c2.radius + " " + c2.numberOfObject);
	}
	
}
