import java.util.ArrayList;
// method 3 of handling thread task
public class AddStringMillionTimeThread extends Thread {
    private ArrayList<String> strings= new ArrayList<>(); //not ideal. If the thread ends, this attribute variable will be gone

    @Override
    public void run(){  //override the run in Thread.class
        for (int i = 0 ; i < 1_000_000; i ++){
            this.strings.add("hello");
        }
    }

    public ArrayList<String> getStrings(){
        return this.strings;
    }
}
