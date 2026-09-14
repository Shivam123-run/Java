public class Emp1 {
	int hours;
	int salary;
 void getInfo(int s, int h) {
	salary = s;
	hours = h;
}
  void addsal() {
	if(salary < 500)
	salary = salary + 10;
}
 void addwork() {
	 if(hours > 6)
		salary = salary + 5;
 }
 void display() {
	 addsal();
	 addwork();
	 System.out.println("Enter the Final Salary : $" + salary);
 }
public static void main (String args[]) {
	Emp1 emp = new Emp1();
	emp.getInfo(5690,12);
	emp.display();
}
}
