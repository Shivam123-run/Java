package shivam.org;
import java.util.*;

public class Ques8 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Rahul");
		list1.add("Rajesh");
		list1.add("Sunil");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("");
		list2.add("");
		list2.add("");

		Collections.copy(list2, list1);

		System.out.println("For List 1: " + list1);
		System.out.println("For List 2: " + list2);
	}

}