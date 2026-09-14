public class Main {
	public static void main(String[] args) {
	Calculator cal = new Calculator();
	int num1 = ConsoleInput.getInteger();
	int num2 = ConsoleInput.getInteger();
	int result_add = cal.add(num1, num2);
	System.out.println("The addition is : " + result_add);
	int resultsub = cal.substract(num1, num2);
	System.out.println("The substraction is : " + resultsub);
	int resultmul = cal.multiply(num1, num2);
	System.out.println("The multiplication is : " + resultmul);
	int resultdiv = cal.divide(num1, num2);
	System.out.println("The division is : " + resultdiv);
	float fnum1 = ConsoleInput.getfloat();
	float fnum2 = ConsoleInput.getfloat();
	float fresult_add = cal.add(fnum1, fnum2);
	System.out.println("The addition is : " + fresult_add);
	float fresultsub = cal.substract(fnum1, fnum2);
	System.out.println("The substraction is : " + fresultsub);
	float fresultmul = cal.multiply(fnum1, fnum2);
	System.out.println("The multiplication is : " + fresultmul);
	float fresultdiv = cal.divide(fnum1, fnum2);
	System.out.println("The division is : " + fresultdiv);
	}
}
