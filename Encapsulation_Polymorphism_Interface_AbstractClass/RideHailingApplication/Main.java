package Encapsulation_Polymorphism_Interface_AbstractClass.RideHailingApplication;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "John", 20, "Downtown");
        Vehicle bike = new Bike("B001", "Alice", 15, "Uptown");
        Vehicle auto = new Auto("A001", "Bob", 10, "Central Station");

        Vehicle[] vehicles = {car, bike, auto};
        double distance = 10; // kms

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println("---------------------------");
        }
    }
}

