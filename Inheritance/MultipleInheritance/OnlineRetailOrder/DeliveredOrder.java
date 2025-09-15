package MultipleInheritance.OnlineRetailOrder;

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // call ShippedOrder constructor
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}