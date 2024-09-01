public class DemoOverloading {
    private int a;
    private int b;

    public DemoOverloading(){
        /* this.a= 100;
        this.b = 50; */
        this(100.2,100); //default 100, 100
    }

    public DemoOverloading(int a, int b){
        this.a = a;
        this.b = b;
    }
    public DemoOverloading(double a, double b){
        this.a = (int)a;
        this.b = (int)b;
    }
    public DemoOverloading(double a){
        this(a,100.12);
    }

    public String toString(){
        return this.a + " " + this.b;
    }

    public static int sum(int x , int y){
        return x+y;
    }
    
    public static double sum (double x , double y){
        return x+y;
    }

    public static void sum(Object x, Object y ){
        System.out.println("calling Void sum(Object x, Object Y)");
    }

    public static void sum(Animal x, Animal y){
        System.out.println("Calling Void sum(Animal x , Animal Y)");
    }
    
    public static void meow(Animal x, Animal y ){
        System.out.println("calling Void meow(Animal x, Animal Y)");
    }


    public static void main(String[] args) {
        //example of overLaoding.
        // overloading is designed and checked during compile time. 

        String a = String.valueOf(true);
        String b = String.valueOf(2.0d);
        char[] arr = new char[] {'c','b','a'};
        System.out.println(String.valueOf(arr));
        System.out.println(String.valueOf(a)+String.valueOf(b));

        sum("ABC","DFE");
        System.out.println(sum(10L,12L)); //long primitive => double
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        sum(c1, c1);
        sum(d1, d1);

        meow(c1, c1);
        System.out.println(new DemoOverloading(10.0d));

        // What is the method parameters arer with type of Wrapper Class?
        

    }

    
}
