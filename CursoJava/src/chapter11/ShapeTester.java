package chapter11;

public class ShapeTester {
	public static void main(String args[]) {
		shape rectangle = new Rectangle(10, 8);
		rectangle.print();
		System.out.println(rectangle.calculateArea());
	}
}
