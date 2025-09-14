package InbuiltFunction.VehicleSystem;

public class Vehicle {
    // Static variable shared by all vehicles
    private static double registrationFee = 100.0;

    // Instance variables
    private final String registrationNumber; // Final variable
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to initialize variables
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0.0) {
            registrationFee = newFee;
        } else {
            System.out.println("Invalid registration fee. Must be non-negative.");
        }
    }

    // Method to display vehicle registration details
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("This object is not a Vehicle instance.");
        }
    }

    // Getters
    public String getOwnerName() { return ownerName; }
    public String getVehicleType() { return vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }
}
