package demoObject.src.marksix;

import java.time.LocalDate;
import java.util.Objects;

public class Result {
    private ball[] balls;    
    private LocalDate date;

    public Result(LocalDate date){
        balls = new ball[0];
        this.date = date;
    };    

    //add(ball ball)


    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    @Override
    public boolean equals(Object obj){  //because we want a real world meaning, instead of object address meaning. 
        if ( this == obj){
            return true;
        }
        if (!(obj instanceof Result)){
            return false;
        }
        Result result = (Result) obj;
        return Objects.equals(this.date,result.getDate()); // only date is materially meaningful.
    }

    public static void main(String[] args) {
        Result r1 = new Result(LocalDate.of(2024,6,25));
        Result r2 = new Result(LocalDate.of(2024,6,25));
        System.out.println(r1.equals(r2));
    }
}


