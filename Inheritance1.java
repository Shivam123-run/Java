class Shape{
	void getShape() {
		System.out.println("This is a Shape class");
	}
}
class Rectangle1 extends Shape{
	void getRectangle() {
		System.out.println("This is a Rectangle Shape");
	}
}
class Circle extends Shape{
	void getCircle() {
		System.out.println("This is a Circle Shape");
	}
}
class Square1 extends Rectangle1{
	void getSquare1() {
		System.out.println("Square is Rectangle");
	}
}
public class Inheritance1 {
 public static void main(String arg[]) {
  Square1 q = new Square1();
  q.getSquare1();
  q.getRectangle();
  q.getShape();
}
}