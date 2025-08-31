import java.util.Scanner;

public class ConvertingUnit {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println(f + " °F = " + convertFahrenheitToCelsius(f) + " °C");

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println(c + " °C = " + convertCelsiusToFahrenheit(c) + " °F");

        // Pounds to Kilograms
        System.out.print("Enter weight in Pounds: ");
        double p = sc.nextDouble();
        System.out.println(p + " lbs = " + convertPoundsToKilograms(p) + " kg");

        // Kilograms to Pounds
        System.out.print("Enter weight in Kilograms: ");
        double kg = sc.nextDouble();
        System.out.println(kg + " kg = " + convertKilogramsToPounds(kg) + " lbs");

        // Gallons to Liters
        System.out.print("Enter volume in Gallons: ");
        double g = sc.nextDouble();
        System.out.println(g + " gallons = " + convertGallonsToLiters(g) + " liters");

        // Liters to Gallons
        System.out.print("Enter volume in Liters: ");
        double l = sc.nextDouble();
        System.out.println(l + " liters = " + convertLitersToGallons(l) + " gallons");

        sc.close();
    }
}
