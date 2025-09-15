package Encapsulation_Polymorphism_Interface_AbstractClass.VehicleRentalSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car("CAR-101", 2000, "POLICY-CAR-001");
        Vehicle v2 = new Bike("BIKE-202", 500, "POLICY-BIKE-002");
        Vehicle v3 = new Truck("TRUCK-303", 5000, "POLICY-TRUCK-003");

        Vehicle[] vehicles = {v1, v2, v3};

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();
            double rentalCost = v.calculateRentalCost(rentalDays);

            double insuranceCost = 0;
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insuranceCost = ins.calculateInsurance();
                System.out.println(ins.getInsuranceDetails());
            }

            System.out.println("Rental Cost (" + rentalDays + " days): " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("--------------------------------");
        }
    }
}

