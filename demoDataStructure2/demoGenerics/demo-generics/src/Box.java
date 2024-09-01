public class Box<T> { //<T> is like any Type.  AKA generic
    // 1. Wrapper classes are object
    // 2. <T> can only be wrapper class

    // You may think of it as an unfinished class. User will finish the class.
    private T value;

    public Box() {
    }

    public Box(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
    public void setValue(T value){
        this.value =  value;
    }

    public static <U> Box<U> createBox (U value){ //can be placed anywhere, this is a static method
        return new Box<>(value);
    }

    public static void main(String[] args) {
        // Type of <T>, is defined after you Main. (But it is actually compile time determination)
        Box<Integer> integerBox = new Box<>(new Integer(1));
        Box<Integer> integerBox2 = new Box<>(1);
        System.out.println(integerBox.getValue());
        System.out.println(integerBox2.getValue());
        integerBox2.setValue(2);
        Box<Integer> integerBox3 = new Box<>();

        Box<String> stringBox = Box.createBox("hello");
        Box<Bird> birdBox = Box.createBox(new Bird());
    }
}
