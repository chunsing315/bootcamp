import java.lang.reflect.Array;
import java.util.Arrays;

public class Box {
    //instant variable: belongs to object;
    private String[] strings;
    private String name;
    //static variable: this belongs to class.  This save some space.
    private static String prefix = "apple";

    public Box(){
        this.strings = new String[0];
    }

    public void setName(String name){
        this.name = Box.prefix.concat("-").concat(name);
    }
    public String getName(){
        return this.name;
    }

    public String[] getString(){
        return this.strings;
    }

    public String toString(){
        return "String: " + Arrays.toString(this.strings);
    }

    public void setString(int index, String s) {
        this.strings[index] = s;
    }

    public void addString(String s){
        String[] temp = new String[this.strings.length+1];
        for ( int i = 0; i<this.strings.length; i++){
            temp[i]=this.strings[i];
        }
        temp[this.strings.length]=s;
        this.strings = temp;
    }

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(Arrays.toString(box.getString()));
        box.addString("Come on!");
        System.out.println(box);
        //Box box2 = new Box(new String[9] );
        //System.out.println(box2);
        System.out.println(box);
        box.addString("let's go!");
        box.setString(1,"cat");
        System.out.println(box);

        //delete string method

        System.out.println(Box.logo);
        box.setName("Amiee");
        System.out.println(box.name);
        
    }
}
