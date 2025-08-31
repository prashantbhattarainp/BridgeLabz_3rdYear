import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find quotient (each child gets) and remainder (leftover chocolates)
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};  // [chocolates per child, leftover]
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Error: Cannot divide among 0 children.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates = " + result[1]);
        }

        sc.close();
    }
}
