package InbuiltFunction.EmployeeSystem;

public class CompanyTest {
    public static void main(String[] args) {
        // Set company name (static)
        Employee.setCompanyName("Tech Innovators Inc.");

        // Create Employee instances
        Employee emp1 = new Employee("Alice", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob", 102, "Project Manager");

        // Display total employees
        Employee.displayTotalEmployees();

        // Display employee details
        System.out.println("\nEmployee 1 Details:");
        emp1.displayEmployeeDetails();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayEmployeeDetails();
    }
}
