class Student {
    public int rollNumber;       // Public
    protected String name;       // Protected
    private double CGPA;         // Private

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public getter & setter for private CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass
class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + 
                           ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 8.9, "AI");
        pg.displayDetails();

        pg.setCGPA(9.2); // modifying private CGPA via setter
        pg.displayDetails();
    }
}
