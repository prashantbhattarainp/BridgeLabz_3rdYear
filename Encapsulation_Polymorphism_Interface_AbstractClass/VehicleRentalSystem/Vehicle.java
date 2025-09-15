package Encapsulation_Polymorphism_Interface_AbstractClass.VehicleRentalSystem;

// Abstract class for common vehicle details
public abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate; // per day

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        setVehicleNumber(vehicleNumber);
        setType(type);
        setRentalRate(rentalRate);
    }

    // Encapsulation: getters & setters with validation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        if (vehicleNumber == null || vehicleNumber.isEmpty()) {
            throw new IllegalArgumentException("Vehicle number cannot be null or empty.");
        }
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type cannot be null or empty.");
        }
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate <= 0) {
            throw new IllegalArgumentException("Rental rate must be positive.");
        }
        this.rentalRate = rentalRate;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + getVehicleNumber());
        System.out.println("Type: " + getType());
        System.out.println("Rental Rate (per day): " + getRentalRate());
    }
}

