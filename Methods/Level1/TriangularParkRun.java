import java.util.Scanner;

public class TriangularParkRun {

    // Method to compute number of rounds
    public static int calculateRounds(double a, double b, double c, double distance) {
        double perimeter = a + b + c;   // Perimeter of the triangular park
        return (int) Math.ceil(distance / perimeter); // Rounds needed (rounded up)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for sides of triangle
        System.out.print("Enter side a of the triangle in meters: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b of the triangle in meters: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c of the triangle in meters: ");
        double c = sc.nextDouble();

        // Distance athlete wants to run = 5 km = 5000 meters
        double distance = 5000;

        // Calculate number of rounds
        int rounds = calculateRounds(a, b, c, distance);

        // Display result
        System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km.");

        sc.close();
    }
}
