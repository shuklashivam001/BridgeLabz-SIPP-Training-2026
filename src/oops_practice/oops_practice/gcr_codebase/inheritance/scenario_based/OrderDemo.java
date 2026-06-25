package oops_practice.oops_practice.gcr_codebase.inheritance.scenario_based;

class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate,
                 String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate,
                   String trackingNumber,
                   String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Order o1 = new Order(101, "10-Jun-2026");

        ShippedOrder o2 = new ShippedOrder(
                102, "11-Jun-2026", "TRK123");

        DeliveredOrder o3 = new DeliveredOrder(
                103, "12-Jun-2026",
                "TRK456", "15-Jun-2026");

        System.out.println("Order 1: " + o1.getOrderStatus());
        System.out.println("Order 2: " + o2.getOrderStatus());
        System.out.println("Order 3: " + o3.getOrderStatus());
    }
}