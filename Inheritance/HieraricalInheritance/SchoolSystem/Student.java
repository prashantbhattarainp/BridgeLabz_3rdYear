package HieraricalInheritance.SchoolSystem;

class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }

    public void displayRole() {
        System.out.println("Role: Student");
    }
}