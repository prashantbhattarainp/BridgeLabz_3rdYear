import java.util.*;

public class FactorUtility {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int num) {
        // Step 1: Count number of factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Step 2: Store factors in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor (excluding the number itself if needed)
    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3); // cube of each factor
        }
        return product;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));

        sc.close();
    }
}
