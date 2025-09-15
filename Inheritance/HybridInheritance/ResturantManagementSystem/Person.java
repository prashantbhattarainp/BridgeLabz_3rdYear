package HybridInheritance.ResturantManagementSystem;

class Person {
    String name;
    int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display basic details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
interface Worker {
    void performDuties(); // abstract method
}
