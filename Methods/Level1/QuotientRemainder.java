import java.util.Scanner;

public class QuotientRemainder {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Handle divisor = 0 case
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor);

            System.out.println("Quotient = " + result[1]);
            System.out.println("Remainder = " + result[0]);
        }

        sc.close();
    }
}
