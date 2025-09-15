package MultipleInheritance.OnlineRetailOrder;

class Order {
    String orderId;
    String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}
