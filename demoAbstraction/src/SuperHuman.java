package demoAbstraction.src;

public class SuperHuman implements Walkable{
    private double height;

    public SuperHuman(){}
    
    public SuperHuman(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    @Override
    public void walk(){}
    @Override
    public void run(){
        System.out.println(" Superman running ...");
    }
    

    
    
}
