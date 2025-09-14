package InbuiltFunction.HospitalSystem;

public class HospitalTest {
    public static void main(String[] args) {
        // Set hospital name (static)
        Patient.setHospitalName("City Hospital");

        // Create patient instances
        Patient patient1 = new Patient("Lathika", 30, "Flu", "P001");
        Patient patient2 = new Patient("Lidiya", 45, "Fracture", "P002");

        // Display total patients
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());

        // Display patient details
        System.out.println("\nPatient 1 Details:");
        patient1.displayPatientDetails();
        System.out.println();
        System.out.println("Patient 2 Details:");
        patient2.displayPatientDetails();
    }
}

