

import java.util.Scanner;

public class StudentMarks {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3]; // [i][0]=Physics, [i][1]=Chemistry, [i][2]=Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                while (true) {
                    if (j == 0) System.out.print("Physics marks: ");
                    else if (j == 1) System.out.print("Chemistry marks: ");
                    else System.out.print("Maths marks: ");

                    double mark = sc.nextDouble();
                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Marks must be between 0 and 100. Try again.");
                    }
                }
            }

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d -> Physics: %.1f, Chemistry: %.1f, Maths: %.1f, Percentage: %.2f%%, Grade: %s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}
