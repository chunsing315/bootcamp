public class Car {
    private static int count = 0;
    private int id;
    private String color;

    public Car(String color){
        this.id = ++count;
        this.color = color;
    }

    public Car(){};


    public int getID(){
        return this.id;
    }

    public String toString(){
        return "Car No." + this.id+" |"//
        +" Color: " + this.color;
    }

    public static void main(String[] args) {
        Car c1 = new Car("yellow");
        Car c2 = new Car("red");
        Car c3 = new Car("blue");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        Car.count=1000;
        Car c9 = new Car("Magenta");
        System.out.println(c9);

        Car cars = new Car();

        for (int i=0; i<100; i++){
            int rand = (int) Math.random()*10;
            String col = "";
            switch (rand){
                case 1: 
                    col = "RED";
                    break;
                case 2: 
                    col = "ORANGE";
                    break;
                case 3: 
                    col = "YELLOW";
                    break;
                case 4: 
                    col = "BLUE";
                    break;
                case 5: 
                    col = "VIOLET";
                    break;
                case 6: 
                    col = "PURPLE";
                    break;
                case 7: 
                    col = "BLACK";
                    break;
                case 8: 
                    col = "ROSE";
                    break;
                case 9: 
                    col = "GOLD";
                    break;
                case 10: 
                    col = "MAGENTA";
                    break;
            }
            //Car.color = col;

        }
    }
}
