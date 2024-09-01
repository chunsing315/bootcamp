package shape;

public class Square extends Shape{
    private double length;

    
    public Square(double length) {
        this.length = length;
    }


    @Override
    public double area(){
        return  Math.pow(this.length,2);
    }
}
