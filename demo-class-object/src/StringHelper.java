public class StringHelper {

    private String str;

    public StringHelper (String str){
        this.str=str;
    }

    public void setCharAt(int x, char rep){ // something happened here in stack mem and heap mem
        String temstr="";
        for (int i=0;i<this.str.length();i++) {
            if (i == x) {
                temstr+=rep;
            } else {
                temstr+=this.str.charAt(i);
            }// construct another string "helao" in memory, and let the pointer point at it
        }
        this.str = temstr; //⭐️The pointer is no longer pointing at "hello"
    }

    public String getString(){
        return this.str;
    }

    public StringHelper append(String s){ //this return an object form! so you can use the same method: chain method
        this.str += s;
        return this; //⭐️
    }

    public String add(String s){ //⭐️ this cannot have chain method for the same object type becasue it return String.
        return this.str += s;
    }

    public String substring(int startIdx,int endIdx){
        String st = "";
        for (int i = startIdx; i<endIdx; i++){
            st += this.str.charAt(i);
        };
        //return this.str = st;   <== this will change the pointer and the pointing memory;
        return st;
    }
    
    public static void main(String[] args) {
        StringHelper sh = new StringHelper("hello"); //⭐️string is immutable 
        System.out.println(sh.getString());
        sh.setCharAt(3,'a');
        System.out.println(sh.getString());
        sh.append(" world").append(" yummy").setCharAt(3, 'l'); //
        System.out.println(sh.getString());
        System.out.println(sh.add(" world").charAt(8));
        System.out.println(sh.getString());
        System.out.println(sh.getString().length());
        System.out.println(sh.getString().charAt(22));
        System.out.println(sh.toString().length());
        System.out.println(sh.substring(2,6)); //should return a new string, i.e. st
        System.out.println(sh.getString()); // should return the original this.str

    }    
}
