package demo.struct;

// 这个例子里面没有main函数的
public class Circle {
	double radius;
	
	static int numberOfObject = 0;
	
	Circle() {
		radius = 1;
		numberOfObject++;
	}
	
	Circle(double newRadius) {
		radius = newRadius;
		numberOfObject++;
	}
	
	static int getNumberOfObject() {
		return numberOfObject;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
}
