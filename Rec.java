public class Rec {
int length;
int breadth;
int area;
int perimeter;
Rec(int l,int b){
	length = l;
	breadth = b;
}
  int Area() {
	return area = length * breadth;	
}
 int Perimeter() {
	return perimeter = 2 * (length + breadth);
 }
 void display() {
	 System.out.println("Area of Rectangle : "+  Area());
	 System.out.println("Perimeter of Rectangle : "+ Perimeter());
 }
public static void main(String args[]) {
	Rec r = new Rec(4, 5);
	r.display();
	Square sq = new Square(5);
	sq.display();
}
}
class Square extends Rec{
	Square(int s){
		super(s, s);
	}
	void display() {
		 System.out.println("Area of Square : "+ Area());
		 System.out.println("Perimeter of Square : "+ Perimeter());
	}
}