package HybridInheritance.ResturantManagementSystem;

public class ResturantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Prashant", 101, "Italian");
        Waiter waiter = new Waiter("Subham", 202, 5);

        System.out.println("---- Chef ----");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\n---- Waiter ----");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
