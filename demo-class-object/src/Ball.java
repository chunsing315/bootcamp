public static void main(String[] args){
    Ball b1 = new Ball(10.1,"RED");
    System.out.println(b1.toString());
}

public class Ball {
    //empty constructor
    private double weight;
    private String color;
    private int number ; 

 
    public Ball(double weight, String color){
        this.color = color;
    }
    public Ball(String color,double weight){
        this.weight = weight;
        this.color = color;
    }
    //public Ball(double weight, String color){} //duplicate
    public Ball(double weight, String color, int number){
        //this.weight = weight;
        //this.color = color;
        this(weight,color); //call self constructor
        this.number = number;
    } 

    public String getColor(){
        return this.color;
    }
    public double getWeight(){
        return this.weight;
    }
    public int getNumber(){
        return this.number;
    }
}