package MultipleInheritance.EducationCourse;

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in percentage

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // call OnlineCourse constructor
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // show online course info
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + calculateFinalFee());
    }

    // Additional method for calculation
    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }
}
