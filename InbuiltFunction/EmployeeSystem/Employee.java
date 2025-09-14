package InbuiltFunction.EmployeeSystem;

public class Employee {
    // Static variable shared across all employees
    private static String companyName;
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final int id; // Final variable
    private String designation;

    // Constructor using 'this' to avoid ambiguity
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static methods
    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("This object is not an Employee instance.");
        }
    }

    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public String getDesignation() { return designation; }
}
