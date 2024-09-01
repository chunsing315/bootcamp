package demoinheritance.src;

public class Student extends Person2{
    private int studentID;

    public Student(int studentID,String name, int age){
        // calling parent class constructor...
        // 1. create Parent Object/space inside Student Object (heap object)
        super(name,age);
        this.studentID= studentID;
    }

    public void setAge(int age){
        super.setAge(age);
    }

    public int getStudentID(){
        return this.studentID;
    }

    public static void main(String[] args) {
        Student s = new Student(1,"Vincent",13);
        
    
    
    
    
    }
}