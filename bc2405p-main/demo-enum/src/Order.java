public class Order {
  private OrderStatus orderStatus;
  private int paidAmount;
  private int orderAmount;

  public Order(int orderAmount) {
    this.orderAmount = orderAmount;
    this.orderStatus = OrderStatus.ORDERED;
  }

  public void credit(int amount) {
    this.paidAmount += amount;
    // Encapsulation
    if (this.isPaid() && this.orderStatus == OrderStatus.ORDERED) {
      // this.setOrderStatus(this.orderStatus.next());
      // this.setOrderStatus(OrderStatus.PAID);
      setToPaid();
    }
  }

  public void setToPaid() {
    this.setOrderStatus(OrderStatus.PAID);
  }

  public boolean isPaid() {
    return this.paidAmount >= this.orderAmount;
  }

  public OrderStatus getOrderStatus() {
    return this.orderStatus;
  }

  public void setOrderStatus(OrderStatus status) {
    this.orderStatus = status;
  }

  public static void main(String[] args) {
    Order order = new Order(100);
    // ....
    // credit card -> 50
    order.credit(50);
    System.out.println(order.isPaid()); // false

    order.credit(50);
    // OrderStatus currenStatus = order.getOrderStatus();
    // if (order.isPaid() && currenStatus == OrderStatus.ORDERED) {
    // order.setOrderStatus(currenStatus.next());
    // }
    System.out.println(order.getOrderStatus()); // PAID
  }
}
