public class Member {
	String Name;
	int Age;
	String Phone;
	String Address;
	int  Salary;
	 void  printSalary() {
		Name = ConsoleInput.getString();
		Age = ConsoleInput.getInteger();
		Phone = ConsoleInput.getString();
		Address = ConsoleInput.getString();
		Salary = ConsoleInput.getInteger();
		 System.out.println("Name : " + Name);
		 System.out.println("Age : " + Age);
		 System.out.println("Phone : " + Phone);
		 System.out.println("Address : " + Address);
		 System.out.println("Salary : " + Salary);	 
	 }
	 public static void main(String args[]) {
		 Member m = new Member();
		 m.printSalary();
		 PrimeMembers pm = new PrimeMembers();
		 pm.display();
	 }
}
class PrimeMembers extends Member{
	 int JoiningYear;
	 int JoiningFees;
	 int isActive;
	 void display() {
		 JoiningYear = ConsoleInput.getInteger();
		 JoiningFees = ConsoleInput.getInteger();
		 isActive = ConsoleInput.getInteger();
		 if(isActive == 0 || isActive == 2) 
			 isActive = isActive;
		 else
			 isActive = 0;
		 System.out.println("JoiningYear : " + JoiningYear);
		 System.out.println("JoiningFees : " + JoiningFees);
		 System.out.println("isActive : " + isActive);	 
	 } 
}
