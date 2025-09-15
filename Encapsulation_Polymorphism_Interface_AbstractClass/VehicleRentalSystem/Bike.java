package Encapsulation_Polymorphism_Interface_AbstractClass.VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
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
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Category: Bike");
    }
}

