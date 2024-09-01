public class App {

    public static <U> Box<U> createBox (U value){
        return new Box<>(value);
    }

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
