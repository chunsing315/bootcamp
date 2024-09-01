import java.util.LinkedList;
import java.util.List;

public class Box {  
    private List<Ball> balls;
    private int capacity;

    public Box(){
        balls = new LinkedList<>();
        this.capacity = 10;
    }
    public void add(Ball ball){
        balls.add(ball);
    }

    public List<Ball> getBalls(){
        return this.balls;
    }



    public class Ball{

        public int getCap(){  
            return capacity;
        }

    }

}
