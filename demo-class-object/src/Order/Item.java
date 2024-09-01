package Order;

public class Item {
    private double price;
    private int quantity;

    public Item(double price, int quantity){
        this.price=price;
        this.quantity= quantity;
    }

    public double getPrice(){
        return this.price;
    }
    public double getQuant(){
        return this.quantity;
    }

    public double subtotal(){
        return this.price*this.quantity;
    }

}
