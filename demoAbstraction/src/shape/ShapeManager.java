package demoAbstraction.src.shape;

public class ShapeManager {
    private Shape shape; //attribute can be an interface


    // Design implication:
    // You should put an object which implemented the contract(interface)
    // so the parameter object MUST contain area() method. ‼️
    public ShapeManager(Shape shape){
        this.shape = shape;
    }

    public void setShape(Shape shape){
        this.shape = shape;
    }

    public Shape getShape() {
        return this.shape;
    }
    // During compile time, Java guarantee object is able to call area() method
    // You cannot throw a cat to it, because Cat object doesn't have area() method
    public boolean isTooBig(){
        return this.shape.area()> 20.0;
    }
    public static void main(String[] args) {

        Shape circle = new Circle (3.0);
        ShapeManager shapeManager = new ShapeManager(new Circle(3.0));
        System.out.println(circle.area()+" is too big? "+shapeManager.isTooBig());
        System.out.println();

        shapeManager.setShape(new Square(4.0));
        System.out.println("Square is too big? "+shapeManager.isTooBig());
    }

    
}
