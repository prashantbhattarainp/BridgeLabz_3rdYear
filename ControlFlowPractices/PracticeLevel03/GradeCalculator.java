
import java.util.Scanner;

// Creating a class with a name that indicates its purpose
class GradeCalculator {

    public static void main(String[] args) {
        // Create a new Scanner object to read from the standard input
        Scanner input = new Scanner(System.in);

        // Prompt the user for marks in Physics
        System.out.print("Enter marks for Physics: ");
        int physicsMarks = input.nextInt();

        // Prompt the user for marks in Chemistry
        System.out.print("Enter marks for Chemistry: ");
        int chemistryMarks = input.nextInt();

        // Prompt the user for marks in Maths
        System.out.print("Enter marks for Maths: ");
        int mathsMarks = input.nextInt();

        // Calculate the total sum of marks
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;

        // Calculate the average percentage
        double averagePercentage = totalMarks / 3.0;

        // Variables to store the final grade and remarks
        char grade;
        String remarks;

        // Check the calculated percentage against the grading guidelines
        if (averagePercentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (averagePercentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (averagePercentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (averagePercentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averagePercentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // Print the final results as specified
        System.out.println("\n--- Student Report ---");
        System.out.printf("Average Mark: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

    }
}
