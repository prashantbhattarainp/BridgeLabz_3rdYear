package Encapsulation_Polymorphism_Interface_AbstractClass.HospitalPatientManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private int numberOfDays;
    private double dailyRate;
    private List<String> records;

    public InPatient(String patientId, String name, int age, int numberOfDays, double dailyRate) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return numberOfDays * dailyRate;
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
        System.out.println("Type: In-Patient");
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Daily Rate: " + dailyRate);
    }
}

