public class Curtain {
    private boolean isOpen ;

    public Curtain(boolean isOpen) {
        this.isOpen = isOpen;
    }
    private void open(){
        isOpen = true;
        System.out.println("Curtain opening");
    }
    private void close(){
        isOpen = false;
        System.out.println("Curtain closing");
    }
    private void toggle(){
        if (this.isOpen) {
            this.isOpen = false;
        } if (!this.isOpen) {
            this.isOpen = true;
        }
    }
    public static void main(String[] args) {
        System.out.println("hello");

    }
}
