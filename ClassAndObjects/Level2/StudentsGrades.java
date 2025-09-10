public class StudentsGrades {
    // Fields (Attributes)
    private String name;
    private String rollNumber;
    private double[] marks;

    // Constructor
    public StudentsGrades(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        double averageMarks = calculateAverageMarks();

        if (averageMarks >= 80 && averageMarks <= 100) {
            return "Grade A";
        } else if (averageMarks >= 60) {
            return "Grade B";
        } else if (averageMarks >= 50) {
            return "Grade C";
        } else if (averageMarks >= 40) {
            return "Grade D";
        } else {
            return "Grade F";
        }
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);

        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }

        System.out.println(calculateGrade());
        System.out.println();
    }

    // Helper method to calculate average marks
    private double calculateAverageMarks() {
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }

    // Main method
    public static void main(String[] args) {
        double[] mark1 = {80, 70, 75};
        double[] mark2 = {60, 65, 50};

        StudentsGrades student1 = new StudentsGrades("Thamarai", "ECE001", mark1);
        StudentsGrades student2 = new StudentsGrades("Kannan", "CSC002", mark2);

        student1.displayStudent();
        student2.displayStudent();
    }
}
