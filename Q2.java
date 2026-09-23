package shivam.org;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Supplier;
@FunctionalInterface
interface Prime{
	boolean check(int n);
}
@FunctionalInterface
interface MyString{
	String concat(String s1, String s2);
}
public class Q2 {
public static void main(String arg[]) {
	List<Integer> list = Arrays.asList(20,50,23,45,12,34,94);
	int largest = Collections.max(list);
	System.out.println(largest);
	int minimum = Collections.min(list);
	System.out.println(minimum);
  Collections.reverse(list);
	System.out.println(list);
	Supplier<Integer> s = () -> {
		Random r = new Random();
		return r.nextInt(999)+100;
	};
	System.out.println(s.get());
	Runnable r = () -> {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date : " + date);
	};
	r.run();
	Scanner sc = new Scanner(System.in);
	Prime p =(n) -> {
		if(n < 2)
			return false;
		for(int i = 2; i < n; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	};
	System.out.println("Enter number : ");
	int num = sc.nextInt();
	if(p.check(num))
		System.out.println(num + " Is Prime");
	else
		System.out.println(num + " is not Prime");
	MyString str = (str1, str2) -> {
		return str1 + str2;
	};
	System.out.println("Enter first string : ");
	String a = sc.nextLine();
	System.out.println("Enter second string : ");
	String b = sc.nextLine();
	String result = str.concat(a ,b);
	System.out.println("Concatenated String : "+ result);
    System.out.print("Enter first string: ");
    String s1 = sc.nextLine();
    System.out.print("Enter second string: ");
    String s2 = sc.nextLine();
   BiFunction<String, String, String> concat = (a1, b1) -> a1 + b1;
    String result1 = concat.apply(s1, s2);
   System.out.println("Concatenated String: " + result1);
}
}
