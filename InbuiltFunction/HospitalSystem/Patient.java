package InbuiltFunction.HospitalSystem;

public class Patient {
    // Static variables shared by all patients
    private static String hospitalName;
    private static int totalPatients = 0;

    // Instance variables
    private final String patientID; // Final variable
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to initialize variables
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static methods
    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("This object is not a Patient instance.");
        }
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAilment() { return ailment; }
    public String getPatientID() { return patientID; }
}
