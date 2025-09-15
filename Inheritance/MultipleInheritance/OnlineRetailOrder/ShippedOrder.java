package MultipleInheritance.OnlineRetailOrder;

class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // call parent constructor
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }
}