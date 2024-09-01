package sorting;

import java.util.Comparator;

public class BallSortByColor implements Comparator<Ball> {

    @Override
    public int compare(Ball b1, Ball b2) {
        // TODO Auto-generated method stub
        if (b1.getColor() == Color.BLACK) {
            return -1;
        }
        if (b1.getColor() == Color.WHITE) {
            return 1;
        }
        if (b1.getColor() == Color.RED && b2.getColor() == Color.WHITE) {
            return -1;
        }
        if (b1.getColor() == Color.RED && b2.getColor() == Color.BLACK) {
            return 1;
        } return -1;

    }
}
