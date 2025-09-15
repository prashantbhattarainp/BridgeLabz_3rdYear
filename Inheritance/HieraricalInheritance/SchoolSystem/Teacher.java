package HieraricalInheritance.SchoolSystem;

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}
