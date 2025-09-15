package Encapsulation_Polymorphism_Interface_AbstractClass.Ecommerce;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Electronics("E101", "Laptop", 60000, 2);
        Product p2 = new Clothing("C202", "T-Shirt", 1500, "M");
        Product p3 = new Groceries("G303", "Rice", 1200, 10);

        Product[] products = {p1, p2, p3};

        for (Product product : products) {
            product.displayProductDetails();
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                tax = taxable.calculateTax();
                System.out.println(taxable.getTaxDetails() + ": " + tax);
            } else {
                System.out.println("No tax applicable.");
            }

            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-------------------------------");
        }
    }
}

