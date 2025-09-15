package MultipleInheritance.OnlineRetailOrder;

public class OnlineRetailSystem {
    public static void main(String[] args) {
        // Base Order
        Order order = new Order("O1001", "2025-09-10");
        System.out.println(order.getOrderStatus());

        // Shipped Order
        ShippedOrder shipped = new ShippedOrder("O1001", "2025-09-10", "TRK12345");
        System.out.println(shipped.getOrderStatus());

        // Delivered Order
        DeliveredOrder delivered = new DeliveredOrder("O1001", "2025-09-10", "TRK12345", "2025-09-15");
        System.out.println(delivered.getOrderStatus());
    }
}
