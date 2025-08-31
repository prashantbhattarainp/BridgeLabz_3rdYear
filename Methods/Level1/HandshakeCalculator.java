import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2; // Formula: nC2
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display result
        System.out.println("The maximum number of possible handshakes among " 
                           + numberOfStudents + " students is: " + handshakes);

        sc.close();
    }
}
