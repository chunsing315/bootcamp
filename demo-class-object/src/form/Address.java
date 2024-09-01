package form;
public class Address {
    private String line1;
    private String line2;
    private String line3;
    private String stNum;
    private String block;
    private String district;

    
    public Address (String line1,String line2,String line3){
        this.line1=line1;
        this.line2=line2;
        this.line3=line3;
    }

    public void setline2(String line2){
        this.line2 = line2;
    }
    public String getLine1(){
        return this.line1;
    }
    public String getLine2(){
        return this.line2;
    }
    public String getLine3(){
        return this.line3;
    }
    public String toString(){
        return this.line1+" "//
        +this.line2+" "//
        +this.line3;

    }


    public static void main(String[] args) {
        //create a Form Object, with Address object
        Address address = new Address("Rm12","San Po Kong","WTS");
        Form f1 = new Form("Vincent","Lau",address);

        System.out.println(f1.getFirstName());
        System.out.println(f1.getLastName());
        System.out.println(f1.getAddress().getLine1());
        System.out.println(f1.getAddress().getLine2());
        System.out.println(f1.getAddress().getLine3());
        System.out.println(f1); // auto return f1.toString();
        System.out.println(f1.getAddress()); //return f1.address.toString();

        Form f2 = new Form("Sing","Wong",address);
        System.out.println(f2.getAddress().getLine2());
        f2.getAddress().setline2("Kwun Tong");
        System.out.println(f1.getAddress().getLine2());
        System.out.println(f2.getAddress().getLine2()); //doesn't make useful sense. logically sound.

        Address address2 = new Address("No.1","Beverly Hill","California");
        Form f3 = new Form("Peter","Burburry",address2);
        f2=f3;
        System.out.println(f2);
        f2.getAddress().setline2("Kwun Tong");
        System.out.println(f2);


    }
}
