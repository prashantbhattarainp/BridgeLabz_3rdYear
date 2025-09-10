public class Circle {
    // Field (Attribute)
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public void calculateArea() {
        System.out.printf("Area of Circle: %.4f", (Math.PI * radius * radius));
    }

    // Method to calculate circumference
    public void calculateCircumference() {
        System.out.printf("\nCircumference of Circle: %.4f", (2 * Math.PI * radius));
    }

    // Main method inside same class
    public static void main(String[] args) {
        // Create Circle object
        Circle circle = new Circle(2.5);

        // Display area and circumference
        circle.calculateArea();
        circle.calculateCircumference();
    }
}
