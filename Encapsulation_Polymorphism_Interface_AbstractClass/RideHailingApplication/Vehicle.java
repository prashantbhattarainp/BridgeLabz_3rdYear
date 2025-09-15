package Encapsulation_Polymorphism_Interface_AbstractClass.RideHailingApplication;

// Abstract class for all vehicles
public abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        setVehicleId(vehicleId);
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
    }

    // Encapsulation with validation
    public String getVehicleId() {
        return vehicleId;
    }

    private void setVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.isEmpty()) {
            throw new IllegalArgumentException("Vehicle ID cannot be null or empty.");
        }
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    private void setDriverName(String driverName) {
        if (driverName == null || driverName.isEmpty()) {
            throw new IllegalArgumentException("Driver name cannot be null or empty.");
        }
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    private void setRatePerKm(double ratePerKm) {
        if (ratePerKm <= 0) {
            throw new IllegalArgumentException("Rate per km must be positive.");
        }
        this.ratePerKm = ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}

