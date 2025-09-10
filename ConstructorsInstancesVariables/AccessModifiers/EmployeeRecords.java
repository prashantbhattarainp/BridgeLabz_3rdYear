class Employee {
    public int employeeID;        // Public
    protected String department;  // Protected
    private double salary;        // Private

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify private salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID + 
                           ", Department: " + department + 
                           ", Salary: " + getSalary() + 
                           ", Team: " + teamName);
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 75000, "Backend Team");
        m.displayDetails();

        m.updateSalary(85000); // modifying private salary via public method
        m.displayDetails();
    }
}
