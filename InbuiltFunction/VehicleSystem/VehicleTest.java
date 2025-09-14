package InbuiltFunction.VehicleSystem;

public class VehicleTest {
    public static void main(String[] args) {
        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.0); // Set registration fee to $150

        // Create vehicle instances
        Vehicle vehicle1 = new Vehicle("Honest Raj", "Sedan", "ABC123");
        Vehicle vehicle2 = new Vehicle("Price Danish", "SUV", "XYZ789");

        // Display vehicle registration details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayRegistrationDetails();
        System.out.println();
        System.out.println("Vehicle 2 Details:");
        vehicle2.displayRegistrationDetails();
    }
}

