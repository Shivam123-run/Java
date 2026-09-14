public class Student {
	String name;
	int roll_no;
	String phone_no;
	String adress;
	
	public static void main(String args[]) {
		
		Student s1 = new Student();
		
		s1.name = "shivam Raut";
		s1.roll_no = 2;
		s1.phone_no = "1234567891";
		s1.adress = "Vaidhapur";
		
		
//		int roll_no = 20; in c++
		
		System.out.println("Student name is : "+s1.name);
		System.out.println("Student roll no : "+s1.roll_no);
		System.out.println("Student Phone number : "+s1.phone_no);
		System.out.println("Student Address : "+s1.adress);  
}
}