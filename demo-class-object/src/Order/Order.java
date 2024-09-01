package Order;

import java.math.BigDecimal;

public class Order {
    private static int count = 0;
    private int id;
    private Item[] items;
    private String couponCode;

public Order(String CouponCode){
    this.id = ++count;
    this.items = new Item[0];
}

public String getCoupon(){
    return this.couponCode;
}

public double getDiscount(){
    if (isCouponValid()){
        return 0.8d;
        return 0.2d;    }
}

public int getID(){
    return this.id;
}
 
public Item[] getItems(){
    return this.items;
}

public void addItem(Item item){
    Item[] tempItem = new Item[this.items.length +1];
    for (int i = 0;i<this.items.length;i++){
        tempItem[i] = this.items[i];
    }
    tempItem[tempItem.length-1]=item;
    this.items = tempItem;
}

public double total(){
    BigDecimal amount = BigDecimal.valueOf(0L);
    //add, subtract medthos return new object.
    for (int i = 0; i < this.items.length;i++){
        amount = amount.add(BigDecimal.valueOf(this.items[i].subtotal()));
    }   
    return amount.doubleValue(); // convert from Big Decimal object to double primitive.
}

public static void main(String[] args) {
    Order order = new Order();
    Item item = new Item (96.9d,2);
    System.out.println(item.subtotal());
    order.addItem(item);
    Item item2 = new Item(11.0,3);
    order.addItem(item2);
    System.out.println(order.total());

}
}
