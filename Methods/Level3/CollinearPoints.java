import java.util.Scanner;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 points
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        // Check collinearity using slope
        boolean slopeResult = checkCollinearSlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area
        boolean areaResult = checkCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing Slope Formula: " + (slopeResult ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Formula: " + (areaResult ? "Collinear" : "Not Collinear"));

        sc.close();
    }

    // Method 1: Check using slope formula
    public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Avoid division by zero -> Use cross multiplication
        // (y2-y1)(x3-x2) == (y3-y2)(x2-x1)
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method 2: Check using area of triangle formula
    public static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0.0;
    }
}
