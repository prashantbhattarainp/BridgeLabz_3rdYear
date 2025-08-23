// Class FriendAnalysis finds the youngest and tallest friend among three
import java.util.Scanner;

class FriendAnalysis {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get age and height of Amar
        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        double heightAmar = input.nextDouble();

        // Get age and height of Akbar
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        double heightAkbar = input.nextDouble();

        // Get age and height of Anthony
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        double heightAnthony = input.nextDouble();

        // Find the youngest
        int youngestAge = ageAmar;
        String youngestName = "Amar";

        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestName = "Akbar";
        }
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestName = "Anthony";
        }

        // Find the tallest
        double tallestHeight = heightAmar;
        String tallestName = "Amar";

        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestName = "Akbar";
        }
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestName = "Anthony";
        }

        // Print results
        System.out.println("The youngest friend is " + youngestName + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestName + " with height " + tallestHeight + " cm");
    }
}
