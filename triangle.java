public class triangle {
int base;
int height;
int perimeter;
int area;
triangle(int b,int h, int s3){
	base = b;
	height = h;
	area = (base * height)/ 2;
	perimeter = base + height + s3;
}
void display() {
	System.out.println("Area of Triangle : " + area);
	System.out.println("Perimeter of Triangle : " + perimeter);
}
public static void main(String args[]) {
	triangle t = new triangle(3, 4, 5);
	t.display();
}
}
