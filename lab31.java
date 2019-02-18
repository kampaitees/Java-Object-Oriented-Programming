import java.util.Scanner;
public class lab31 {
	public static void main(String args[]) {
		Shape obj = new Triangle();
		obj.printArea();
		Shape obj2 = new Rectangle();
		obj2.printArea();
		Shape obj3 = new Circle();
		obj3.printArea();
	}
}

abstract class Shape {
	double length = 3, width = 4;
	abstract void printArea();
}

class Triangle extends Shape {
	double area;
	protected void printArea() {
		area = (width * length) / 2;
		System.out.println("The area of Triangle is:" +area);
	}
}
class Rectangle extends Shape {
	double area;
	protected void printArea() {
		area = length * width;
		System.out.println("The area of Rectangle is:" +area);
	}
}

class Circle extends Shape {
	double  area;
	protected void printArea() {
		area = (22 * length * length) / 7;
		System.out.println("The area of Circle is:" +area);
	}
}

