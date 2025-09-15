package SingleInheritance.SmartHomeDevices;

class ThermoStat extends Device {
    double temperatureSetting; // specific attribute

    // Constructor
    public ThermoStat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus() to add thermostat details
    @Override
    public void displayStatus() {
        super.displayStatus(); // show device details
        System.out.println("Temperature Setting: " + temperatureSetting + " °C");
    }
}
