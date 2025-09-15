package Encapsulation_Polymorphism_Interface_AbstractClass.HospitalPatientManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String diagnosis, String treatment) {
        records.add("Diagnosis: " + diagnosis + " | Treatment: " + treatment);
    }

    @Override
    public void viewRecords() {
        if (records.isEmpty()) {
            System.out.println("No medical records available.");
        } else {
            for (String record : records) {
                System.out.println(record);
            }
        }
    }

    @Override
    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Type: Out-Patient");
        System.out.println("Consultation Fee: " + consultationFee);
    }
}

