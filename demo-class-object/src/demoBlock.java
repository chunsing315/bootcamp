public class demoBlock {

    private static int number;
    private String name;

    static{
        System.out.println("static block start"); //static block, before everything
        number = 3;
        System.out.println("static block end");
    }
    
    {
        System.out.println("start instance"); // instance block, before constructor. only triggers everytime when new object is created
        this.name = "John";
        System.out.println("end instance");
        number = 4;
    }

    public demoBlock() {
        System.out.println("calling empty constructor..."); // after instance block
    }
     
    public demoBlock(String name){
        System.out.println("Calling all args constructor");
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(demoBlock.number+' '); //3
        demoBlock db = new demoBlock(); //
        System.out.println(demoBlock.number); //3
        demoBlock db2 = new demoBlock("Vincent"); //4
        System.out.println(demoBlock.number);
        System.out.println("end.");
    }
    
}
