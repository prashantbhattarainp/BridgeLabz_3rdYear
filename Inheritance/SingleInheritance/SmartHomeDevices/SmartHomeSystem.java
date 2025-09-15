package SingleInheritance.SmartHomeDevices;

public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object
        ThermoStat thermostat = new ThermoStat("T1001", "ON", 24.5);

        // Display device + thermostat status
        thermostat.displayStatus();
    }
}