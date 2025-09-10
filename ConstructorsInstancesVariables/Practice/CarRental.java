class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    // Default constructor
    public CarRental() {
        this("Customer", "Sedan", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

    // Private method to calculate rental cost
    private double calculateCost() {
        double rate;
        switch (carModel.toLowerCase()) {
            case "suv": rate = 3000; break;
            case "sedan": rate = 2000; break;
            default: rate = 1500;
        }
        return rate * rentalDays;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Alice", "SUV", 5);

        c1.display();
        c2.display();
    }
}
