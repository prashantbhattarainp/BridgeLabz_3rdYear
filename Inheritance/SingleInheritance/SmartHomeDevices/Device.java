package SingleInheritance.SmartHomeDevices;

class Device {
    String deviceId;
    String status; // e.g., "ON" or "OFF"

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device info
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
