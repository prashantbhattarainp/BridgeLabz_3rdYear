import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate Wind Chill Temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + 
               (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();

        // Check valid input ranges
        if (temperature <= 50 && windSpeed >= 3) {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The Wind Chill Temperature is: %.2f°F\n", windChill);
        } else {
            System.out.println("Formula is valid only if temperature <= 50°F and wind speed >= 3 mph.");
        }

        sc.close();
    }
}
