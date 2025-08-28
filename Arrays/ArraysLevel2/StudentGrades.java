import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];   // stores Physics, Chemistry, Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");

            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();

                // Check for negative marks
                while (marks[i][j] < 0 || marks[i][j] > 100) {
                    System.out.print("Invalid! Enter marks between 0-100: ");
                    marks[i][j] = sc.nextInt();
                }
            }

            // Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Assign grade
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Display Results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d | Percentage: %.2f%% | Grade: %c%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}
