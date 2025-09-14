package InbuiltFunction.UniversitySystem;

public class UniversityTest {
    public static void main(String[] args) {
        // Set university name (static)
        Student.setUniversityName("Global University");

        // Create student instances
        Student student1 = new Student("Hemashree", 101, 'A');
        Student student2 = new Student("Sharmila", 102, 'B');

        // Display total students
        Student.displayTotalStudents();

        // Display student details
        System.out.println("\nStudent 1 Details:");
        student1.displayStudentDetails();
        System.out.println();
        System.out.println("Student 2 Details:");
        student2.displayStudentDetails();

        // Update a student's grade
        System.out.println();
        student2.updateGrade('A');

        // Display updated student details
        System.out.println();
        student2.displayStudentDetails();
    }
}
