import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            // Invalid age
            return false;
        } else if (age >= 18) {
            return true; // Eligible to vote
        } else {
            return false; // Not eligible
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10]; // Array to store ages of 10 students

        // Take user input
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            // Check eligibility
            boolean canVote = checker.canStudentVote(ages[i]);

            // Display result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
            System.out.println();
        }

        sc.close();
    }
}
