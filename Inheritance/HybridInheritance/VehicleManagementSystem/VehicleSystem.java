package HybridInheritance.VehicleManagementSystem;

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 225, 75);
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 200, 45);

        System.out.println("---- Electric Vehicle ----");
        tesla.displayDetails();
        tesla.charge();

        System.out.println("\n---- Petrol Vehicle ----");
        honda.displayDetails();
        honda.refuel();
    }
}
