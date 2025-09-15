package Encapsulation_Polymorphism_Interface_AbstractClass.EmployeeManagementSystem;

// Subclass for Full-Time Employee
public class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // Full-time salary = base salary (fixed)
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Full-Time Employee");
        System.out.println(getDepartmentDetails());
        System.out.println("Final Salary: " + calculateSalary());
        System.out.println("-----------------------------");
    }
}

