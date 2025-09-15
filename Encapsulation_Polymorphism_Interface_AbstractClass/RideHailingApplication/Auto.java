package Encapsulation_Polymorphism_Interface_AbstractClass.RideHailingApplication;

public class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; // 20% cheaper than car
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
        System.out.println("Vehicle Type: Auto");
        System.out.println("Current Location: " + currentLocation);
    }
}

