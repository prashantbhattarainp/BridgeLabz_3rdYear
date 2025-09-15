package Encapsulation_Polymorphism_Interface_AbstractClass.VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
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
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // 10% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Category: Car");
    }
}

