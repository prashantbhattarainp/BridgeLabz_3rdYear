package HybridInheritance.ResturantManagementSystem;

class Chef extends Person implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking " + specialty + " dishes.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }
}
