public enum OrderStatus {
    ORDERED(1),READY_TO_SHIP(2),DELIVERED(3);

    private int num;

    private OrderStatus(int num){
        this.num = num;
    }

    private int getValue(){
        return this.num;
    }

    public OrderStatus next(){
        for (OrderStatus status : OrderStatus.values()){
            if (this.num +1 == status.getValue()){
                return status;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(OrderStatus.READY_TO_SHIP.next());
    }
    
}

