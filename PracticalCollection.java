import java.util.ArrayList;
public class PracticalCollection {
public static void main(String arg[]) {
	ArrayList<String> color = new ArrayList<>();
	color.add("Red");
	color.add("Blue");
	color.add("Green");
	System.out.println(color);
	
	System.out.println("=======================");
	
	color.set(0, "White");
	System.out.println(color);
	
	System.out.println("=======================");
	
	System.out.println(color.get(0));
	
	System.out.println("=======================");
	
	color.set(1, "Pink");
	System.out.println(color);

	System.out.println("=======================");
	
	color.remove(2);
	System.out.println(color);
	
	System.out.println("=======================");
}
}
