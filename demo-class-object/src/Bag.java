import java.util.Arrays;

public class Bag {
    private int[] integers;

    //constructor
    //getter, setter
    //toString()
    public Bag (int[] integers){ //constructor
        this.integers = integers;
    }
    public void setIntegers(int[] integers){
        this.integers = integers;
    }
    public int[] getIntegers(){
        return this.integers;
    }
    public String toString() {
        return "Bag("//
        +"integers" + Arrays.toString(this.integers)//Arrays wrapper class
        +")";
    }
    public static void main(String[] args) {
        int[] integers = new int[] {3,2,1,9,999};
        Bag b1 = new Bag(integers);
        System.out.println(b1.toString());
        int[] x = b1.getIntegers();
        System.out.println(Arrays.toString(x));
        b1.setIntegers(new int[] {5,6,7});
        //
        System.out.println(new Bag(new int[] {-100,-2,6}).toString());
        b1 = new Bag(integers); // pointer vs new object
        System.out.println(b1.toString());
        b1 = new Bag(new int[] {7,8,9});
        System.out.println(b1.toString());


        
    }   

}

