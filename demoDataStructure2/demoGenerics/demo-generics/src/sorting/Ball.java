package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Objective: learn existing interface
public class Ball implements Comparable<Ball> {
    private int number;
    private Color color;

    public Ball() {
    }

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int compareTo(Ball ball){
        //Objective: provide your own formula to sort your list<Ball>
        ///return                  //1 or -1

        //example 1: sort by number and descending
        // 2 ball ref now: 1)ball 2)this
        // -1 means sort first (left to right), a.k.a. move to left
        
        if (this.color.getRank() == ball.getColor().getRank()){
            return this.number < ball.getNumber() ? -1 : 1 ;
        } else{
            return this.color.getRank()< ball.getColor().getRank() ? -1 :1;
        }
    }

    @Override
    public String toString(){
        return "Ball(" + this.number + ")" + "Color = "+this.color;
    }

    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(10,Color.BLACK));
        balls.add(new Ball(13,Color.RED));
        balls.add(new Ball(8,Color.WHITE));
        
        System.out.println(balls);
        //approach 1
        Collections.sort(balls); // looping throught the balls --> call Loop List<Ball> -> ball.compareTo()
        System.out.println(balls);

        //approach 2
        Collections.sort(balls,new BallSortByColor()); // you have to 'new' the formula

        // Formula 

    }

}
