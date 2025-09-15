package Encapsulation_Polymorphism_Interface_AbstractClass.RideHailingApplication;

public class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // Simple fare calculation
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("Vehicle Type: Car");
        System.out.println("Current Location: " + currentLocation);
    }
}
