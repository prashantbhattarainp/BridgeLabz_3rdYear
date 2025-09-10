class Vehicle {
    private String ownerName;     // Instance variable
    private String vehicleType;   // Instance variable
    private static double registrationFee = 5000.0; // Class variable (shared)

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + 
                           ", Vehicle Type: " + vehicleType + 
                           ", Registration Fee: " + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for testing
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee (affects all vehicles)
        Vehicle.updateRegistrationFee(6000.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
