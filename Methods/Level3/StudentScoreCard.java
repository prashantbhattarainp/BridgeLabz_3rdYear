import java.util.*;

public class StudentScoreCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Generate random marks for PCM
        int[][] marks = generateMarks(n);

        // Step 3: Calculate total, average, and percentage
        double[][] results = calculateResults(marks);

        // Step 4: Display scorecard
        displayScoreCard(marks, results);
    }

    // Method to generate random 2-digit marks for Physics, Chemistry, Math
    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + rand.nextInt(90); // Physics
            scores[i][1] = 10 + rand.nextInt(90); // Chemistry
            scores[i][2] = 10 + rand.nextInt(90); // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] results = new double[n][3]; // total, avg, percentage

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = (double) total / 3;
            double percent = (total / 300.0) * 100;

            // Round off to 2 digits
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] marks, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t\t" +
                    marks[i][2] + "\t" +
                    (int)results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "%");
        }
    }
}
