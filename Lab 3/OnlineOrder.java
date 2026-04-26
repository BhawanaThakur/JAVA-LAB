class Order{
    int OrderId;
    Double amount;
    Order(int OrderId, Double amount) {
        this.OrderId = OrderId;
        this.amount = amount;
    }
void displayOrder() {
    System.out.println("Order ID: " + OrderId); 
    System.out.println("Amount: " + amount);
}
}
public class OnlineOrder extends Order {
  int deliveryCharges;

    OnlineOrder(int OrderId, Double amount, int deliveryCharges) {
        super(OrderId, amount);
        this.deliveryCharges = deliveryCharges;
    }
    void displayOnlineOrder() {
        displayOrder();
        System.out.println("Delivery Charges: " + deliveryCharges);
    }
    public static void main(String[] args) {
        OnlineOrder onlineOrder = new OnlineOrder(12345, 250.00, 50);
        onlineOrder.displayOnlineOrder();
    }}