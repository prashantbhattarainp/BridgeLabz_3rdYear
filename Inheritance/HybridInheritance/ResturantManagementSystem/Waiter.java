package HybridInheritance.ResturantManagementSystem;

class Waiter extends Person implements Worker {
    int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving " + tablesAssigned + " tables.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tables Assigned: " + tablesAssigned);
    }
}