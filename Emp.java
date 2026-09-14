public class Emp {

	String name;
	int yearOfJoining;
	String address;
	
	Emp(String na, int ye, String ad){
		
		name = na;
		yearOfJoining = ye;
		address = ad;
		
	}
		
		public static void main(String[] args) {
			
			Emp e1 = new Emp("Shivam Raut", 2026, "India");
			Emp e2 = new Emp("Shivam Soni", 2023, "India");
			Emp e3 = new Emp("Shivam sinha", 2022, "India");
			
			System.out.println("Name\t\t Year of joining\t Address ");
			System.out.println(e1.name + "\t" + "\t" + e1.yearOfJoining + "\t\t\t" + e1.address);
			System.out.println(e2.name + "\t" + "\t" + e2.yearOfJoining + "\t\t\t" + e2.address);
			System.out.println(e3.name + "\t" + "\t" + e3.yearOfJoining + "\t\t\t" + e3.address);
			
			
			
		}
	
}
