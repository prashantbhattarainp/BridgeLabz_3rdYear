package InbuiltFunction.UniversitySystem;

public class Student {
    // Static variables shared by all students
    private static String universityName;
    private static int totalStudents = 0;

    // Instance variables
    private final int rollNumber; // Final variable
    private String name;
    private char grade;

    // Constructor using 'this' to initialize variables
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static methods
    public static void setUniversityName(String name) {
        universityName = name;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("This object is not a Student instance.");
        }
    }

    // Method to update grade
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("This object is not a Student instance.");
        }
    }

    // Getters
    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public char getGrade() { return grade; }
}