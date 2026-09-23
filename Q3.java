package shivam.org;
import java.util.function.Supplier;
import java.util.Random;
public class Q3 {
	    public static void main(String[] args) {

	        // Create Random object
	        Random random = new Random();

	        // Create Supplier to generate OTP
	        Supplier<String> otpGeneration = () -> {

	            String vowels = "AEIOU";

	            // Generate first character
	            char firstChar = vowels.charAt(random.nextInt(vowels.length()));

	            // Generate 4 random digits
	            int digit1 = random.nextInt(10);
	            int digit2 = random.nextInt(10);
	            int digit3 = random.nextInt(10);
	            int digit4 = random.nextInt(10);

	            // Return OTP
	            return "" + firstChar + digit1 + digit2 + digit3 + digit4;
	        };

	        // Call Supplier
	        String otp = otpGeneration.get();

	        // Print OTP
	        System.out.println("Generated OTP: " + otp);
	    }
	}

