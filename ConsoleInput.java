public class ConsoleInput{
public static float getfloat() {
	return Float.parseFloat(getString());
		}
public static int getInteger() {
	return Integer.parseInt(getString());
}

public static String getString() {
		try{
			byte inputarr[] = new byte[100];
			System.out.println("Enter the value : ");
			int length = System.in.read(inputarr);
			byte arrfinal[] = new byte[length - 2];
			System.arraycopy(inputarr, 0 , arrfinal, 0 , length -  2);
			String t = new String(arrfinal);
			return t;
		}
		 catch (Exception e){
			 System.out.println(e);
		 }
		return null; 
}
}
