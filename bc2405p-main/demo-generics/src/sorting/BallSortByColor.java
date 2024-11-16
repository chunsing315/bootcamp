package sorting;

import java.util.Comparator;

public class BallSortByColor implements Comparator<Ball> {
  // RED -> BLACK -> WHITE
  @Override
  public int compare(Ball b1, Ball b2) {
    if (b1.getColor() == Color.RED)
      return -1;
    if (b1.getColor() == Color.BLACK && b2.getColor() == Color.WHITE)
      return -1;
    if (b1.getColor() == Color.BLACK && b2.getColor() == Color.RED)
      return 1;
    if (b1.getColor() == Color.WHITE)
      return 1;
    return 1;
  }
}
