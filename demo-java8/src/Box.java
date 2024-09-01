public class Box<T> {
    T data;

    public Box(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        // box is null
        Box<String> box = null;

        // The String is null
        Box<String> box2 = new Box<>(null);
    }
}
