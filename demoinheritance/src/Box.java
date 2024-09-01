package demoinheritance.src;

public class Box {

    private  String password;

    public Box(String x ){
        this.password = x;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        System.out.println("Set password is working...");
        System.out.println(this.password+" before");
        this.password = password;
        System.out.println(this.password+" after");
        System.out.println("Set password finished working.");
    }

    public void append (Box password){
        
        System.out.println("append is working...");
        password.setPassword("XYZ");
        System.out.println(this.password+" before");
        this.password = "BCD";
        System.out.println(this.password+" after");
        System.out.println("append finished working.");
        
    }


    public static void main(String[] args) {
        Box p1 = new Box("ABC");
        Box p2 = new Box("DEF");
        p1.append(p2);
        System.out.println(p1.getPassword()+p2.getPassword());
    }

}
