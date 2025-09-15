package Encapsulation_Polymorphism_Interface_AbstractClass.VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        setInsurancePolicyNumber(insurancePolicyNumber);
    }

    private void setInsurancePolicyNumber(String insurancePolicyNumber) {
        if (insurancePolicyNumber == null || insurancePolicyNumber.isEmpty()) {
            throw new IllegalArgumentException("Insurance policy number cannot be null or empty.");
        }
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // additional fixed maintenance cost
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Category: Truck");
    }
}

