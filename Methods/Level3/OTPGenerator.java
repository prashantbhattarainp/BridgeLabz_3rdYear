import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Math.random() generates [0,1). Multiply by 900000 and add 100000 to ensure 6 digits
        return (int)(100000 + Math.random() * 900000);
    }

    // Method to generate an array of OTPs (10 times)
    public static int[] generateMultipleOTPs(int size) {
        int[] otps = new int[size];
        for (int i = 0; i < size; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length; // if size same → all unique
    }

    // Main method
    public static void main(String[] args) {
        int[] otps = generateMultipleOTPs(10);

        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
