public class Rectangle {
int length;
int breadth;
int area;
Rectangle(int l,int b){
	length = l;
	breadth = b;
}
public int Area() {
	area = length * breadth;
	return area;
}
public static void main(String args[]) {
	Rectangle r = new Rectangle(4, 5);
	Rectangle r1 = new Rectangle(5, 8);
	System.out.println("Area of Rectangle 1 : "+ r.Area());
	System.out.println("Area of Rectangle 2 : "+ r1.Area());
}
}
