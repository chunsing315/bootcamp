package demoObject.src.marksix;

import java.util.Arrays;
import java.util.Objects;

public class ball {
    public int number; //don't use byte, because if you use "=", it doesn't work.

    public ball(int x){
        this.number = x;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString(){
        return "Ball ("//
        + this.number//
        +")";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        } 
        if (!(obj instanceof ball)){
            return false;
        }
        ball ball = (ball) obj;
        return Objects.equals(this.number,ball.getNumber());
    }
    public static void main(String[] args) {
        byte b1 = 48; // java(special conversion : int -> byte, but without casting in downcast)
        int i1 =48;
        b1 = (byte) i1;  //this doesn't work, unless explicitly declare. the type of i1 is int, so we need to explicity convert the value
        ball b2= new ball(1);
        ball b3= new ball(1);
        b2.setNumber(1);
        b3.setNumber(1);
        System.out.println(b3.equals(b2));

        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[3];
        System.out.println(arr.equals(arr2)); //there is no override method!!
        System.out.println(Arrays.equals(arr,arr2));
        
        ball ball1 = new ball(48);
        Object ball2 = new ball(48);
        System.out.println(ball1.getClass());

        Class<?> clazz = ball1.getClass(); //catch the getClass
        System.out.println(clazz);

        System.out.println(ball1 instanceof ball);

    }



}
