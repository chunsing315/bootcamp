package form;
public class Form {
    private String firstName;    
    private String lastName;
    private Address address; //self defined class, to be put into classes
    //private Residence[] residence; 

    public Form(String firstName, String lastName, Address address){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address = address;
    }

    public void setFirstName(String st){
        this.firstName = st;
    }
    public void setLastName(String st){
        this.lastName = st;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public Address getAddress(){
        return this.address;
    }
    public String toString(){
        return this.firstName + " "+ this.lastName + " " +this.address;
    }

    
}
