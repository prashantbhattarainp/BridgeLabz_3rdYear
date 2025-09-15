package Encapsulation_Polymorphism_Interface_AbstractClass.EmployeeManagementSystem;


public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("E001", "Alice", 50000);
        Employee emp2 = new PartTimeEmployee("E002", "Bob", 0, 80, 500);

        ((Department) emp1).assignDepartment("HR");
        ((Department) emp2).assignDepartment("IT Support");

        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}

