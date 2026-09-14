import java.util.Scanner;
public class Complex {
    double real;
    double imag;
    public Complex(double r, double i) {
        real = r;
        imag = i;
    }
    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }
    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imag - c2.imag);
    }
    public static Complex multiply(Complex c1, Complex c2) {
        double r = (c1.real * c2.real) - (c1.imag * c2.imag);
        double i = (c1.real * c2.imag) + (c1.imag * c2.real);
        return new Complex(r, i);
    }
    public void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            double absoluteImag = imag; 
            System.out.println(real + " - "  + "i");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Complex Number");
        System.out.print("Enter real part (a): ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part (b): ");
        double imag1 = scanner.nextDouble();
        Complex c1 = new Complex(real1, imag1);
        System.out.println("Enter Second Complex Number");
        System.out.print("Enter real part (c): ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part (d): ");
        double imag2 = scanner.nextDouble();
        Complex c2 = new Complex(real2, imag2);
        Complex sum = Complex.add(c1, c2);
        Complex difference = Complex.subtract(c1, c2);
        Complex product = Complex.multiply(c1, c2);
        System.out.println("\n=== Results ===");
        System.out.print("First Number: ");
        c1.display();
        System.out.print("Second Number: ");
        c2.display();
        System.out.print("\nAddition: ");
        sum.display();
        System.out.print("Subtraction: ");
        difference.display();
        System.out.print("Multiplication: ");
        product.display();
    }
}