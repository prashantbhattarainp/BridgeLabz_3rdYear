package HieraricalInheritance.SchoolSystem;

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administration");

        System.out.println("---- Teacher ----");
        teacher.displayRole();
        teacher.displayDetails();

        System.out.println("\n---- Student ----");
        student.displayRole();
        student.displayDetails();

        System.out.println("\n---- Staff ----");
        staff.displayRole();
        staff.displayDetails();
    }
}
