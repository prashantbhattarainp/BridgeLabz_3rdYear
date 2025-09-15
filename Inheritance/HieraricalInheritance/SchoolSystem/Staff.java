package HieraricalInheritance.SchoolSystem;

class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    public void displayRole() {
        System.out.println("Role: Staff");
    }
}
