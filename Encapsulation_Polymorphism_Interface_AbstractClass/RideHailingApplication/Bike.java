package Encapsulation_Polymorphism_Interface_AbstractClass.RideHailingApplication;

public class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9; // 10% cheaper than car
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
        System.out.println("Vehicle Type: Bike");
        System.out.println("Current Location: " + currentLocation);
    }
}

