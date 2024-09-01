package Linkedlist;

public class Cat {
    private Eye[] eyes; // array object memory location

    public Cat(Color color){
        this.eyes = new Eye[2];
        this.eyes[0] = new Eye(color);
        this.eyes[1] = new Eye(color);
    }

    public Eye[] getEyes() {
        return this.eyes;
    }
    public Eye getLeftEyes() {
        return this.eyes[0];
    }
    public Eye getRightEyes() {
        return this.eyes[1];
    }

    public void setEyes(Eye[] eyes) {
        this.eyes = eyes;
    }

    
}
