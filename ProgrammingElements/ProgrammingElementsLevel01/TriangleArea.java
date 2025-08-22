import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of triangle with base " + base + " and height " + height + " is " + area);

        sc.close();
    }
}
