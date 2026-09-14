public class InheriTance {

    void parentMenthod() {
        System.out.println("This is parent class");
    }
    
    public static void main(String[] args) {
        InheriTance parent = new InheriTance();
        Child child = new Child();
        
        parent.parentMenthod();

        child.display();
        child.parentMenthod();
    }
}

class Child extends InheriTance {
	void display() {
		System.out.println("This is child class");
	}
}