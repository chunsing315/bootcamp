import java.util.ArrayList;

public class AddStringMillionTimeThread extends Thread {
  private ArrayList<String> strings = new ArrayList<>();

  public ArrayList<String> getStrings() {
    return this.strings;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1_000_000; i++) {
      this.strings.add("abc");
    }
  }
}
