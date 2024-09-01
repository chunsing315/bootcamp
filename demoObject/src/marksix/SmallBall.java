package demoObject.src.marksix;

import java.util.Objects;

public class SmallBall extends ball{
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    
    public SmallBall(String color, int number){
        this.color = color;
        super.number = number;
    }
    
    @Override
    public String toString(){
        return "SmallBall ("+this.color//
        + "," + super.toString() //
        +")";
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.color, super.getNumber()); //can be this and super 
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof SmallBall)){
            return false;
        }
        SmallBall sm = (SmallBall) obj;
        return Objects.equals(this.color,sm.getColor()) //
        && Objects.equals(this.getNumber(),sm.getNumber()); //  use super here 
    }

    public static void main(String[] args) {
        SmallBall sm1 = new SmallBall("Violet", 8);
        SmallBall sm2 = new SmallBall("Violet", 9);
        SmallBall sm3 = new SmallBall("Orange", 9);
        SmallBall sm4 = new SmallBall("Orange", 9);
        System.out.println(sm3.equals(sm4));
        System.out.println(sm3);
        System.out.println(sm4);
        System.out.println(sm1.equals(sm2));
        System.out.println(sm1.hashCode());
        System.out.println(sm2.hashCode());
    }
}
