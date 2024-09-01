package demoinheritance.src.shape;

public class MiniCircle extends Circle{
    private String color;    

    public MiniCircle(double radius, String color){
        super(radius);
        this.color = color;
    }

    public void setColor (String color){
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }

    /* @Override
    public double area(){
        return super.area();
    } */ 
   // final method cannot be overriden in child class. 

    public static void main(String[] args) {
        MiniCircle mc = new MiniCircle(3.0d,"RED");
        System.out.println(mc.getRadius());
        System.out.println(mc.area());
        System.out.println(mc.getColor());
    }
}
