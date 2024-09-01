package Linkedlist;

public class Eye {
    public Color color; // enum Color.BLUE object memory location

    public Eye(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Eye Color: " + this.color.toString();
    }

}
