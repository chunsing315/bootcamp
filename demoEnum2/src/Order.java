public class Order{
    private OrderStatus orderStatus;
    private int paidAmount;
    private int orderAmount;

    public Order(int orderAmount){
        this.orderAmount = orderAmount;
        this.orderStatus = OrderStatus.ORDERED;
    }

    public void credit(int amount){
        this.paidAmount += amount;
        if (this.isPaid() && this.orderStatus == OrderStatus.ORDERED){
            //this.setOrderStatus(this.orderStatus.next());
            setToPaid();
        }
    }

    public void setToPaid(){
        this.setOrderStatus(OrderStatus.ORDERED);
    }

    public boolean isPaid(){
        return this.paidAmount >= this.orderAmount;
    }

    public OrderStatus getOrderStatus(){
        return this.orderStatus;
    }

    public void setOrderStatus(OrderStatus status){
        this.orderStatus = status;
    }
    public static void main(String[] args) {
        Order order = new Order(100);


        order.credit(50);
        System.out.println(order.isPaid());
        
        order.credit(50);
        System.out.println(order.isPaid());
        OrderStatus currentStatus = order.getOrderStatus();


       /*  if (order.isPaid() && (currentStatus== OrderStatus.ORDERED)) {
            order.setOrderStatus(currentStatus.next());
        } */
        System.out.println(order.getOrderStatus());
        System.out.println(currentStatus.toString());
    }
}