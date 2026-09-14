public class Employee {
String name;
int year;
String address;
public void setdata(String s, int y, String a) {
	name = s;
	year = y;
	address = a;
}
public void display() {
	System.out.println("Name : "+ name);
	System.out.println("Year : "+ year);
	System.out.println("Address : "+ address);
}
public static void main(String args[]) {
	Employee e = new Employee();
	e.setdata("John", 1984, "Pune");
	e.display();
	System.out.println("=============================");
	e.setdata("Sagar", 1989, "Patna");
	e.display();
	System.out.println("=============================");
	e.setdata("Suman", 1946, "Lucknow");
	e.display();
}
}
