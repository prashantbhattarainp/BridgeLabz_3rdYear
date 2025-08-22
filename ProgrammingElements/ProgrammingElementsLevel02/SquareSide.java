import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take perimeter input
        System.out.print("Enter perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Formula: side = perimeter / 4
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side 
                           + " whose perimeter is " + perimeter);
    }
}
