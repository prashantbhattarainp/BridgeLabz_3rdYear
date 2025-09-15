package Encapsulation_Polymorphism_Interface_AbstractClass.EmployeeManagementSystem;

// Subclass for Part-Time Employee
public class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        setWorkHours(workHours);
        setHourlyRate(hourlyRate);
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        if (workHours < 0) {
            throw new IllegalArgumentException("Work hours cannot be negative.");
        }
        this.workHours = workHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        // Part-time salary = hourly rate × work hours
        return getHourlyRate() * getWorkHours();
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
        System.out.println("Role: Part-Time Employee");
        System.out.println("Work Hours: " + getWorkHours());
        System.out.println("Hourly Rate: " + getHourlyRate());
        System.out.println(getDepartmentDetails());
        System.out.println("Final Salary: " + calculateSalary());
        System.out.println("-----------------------------");
    }
}

