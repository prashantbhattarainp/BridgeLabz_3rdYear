package Encapsulation_Polymorphism_Interface_AbstractClass.HospitalPatientManagementSystem;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "John Doe", 45, 5, 2000);
        Patient p2 = new OutPatient("P002", "Jane Smith", 30, 500);

        // Adding medical records
        if (p1 instanceof MedicalRecord) {
            MedicalRecord mr = (MedicalRecord) p1;
            mr.addRecord("Appendicitis", "Surgery");
        }
        if (p2 instanceof MedicalRecord) {
            MedicalRecord mr = (MedicalRecord) p2;
            mr.addRecord("Flu", "Medication");
        }

        Patient[] patients = {p1, p2};

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                System.out.println("Medical Records:");
                ((MedicalRecord) patient).viewRecords();
            }

            System.out.println("---------------------------");
        }
    }
}

