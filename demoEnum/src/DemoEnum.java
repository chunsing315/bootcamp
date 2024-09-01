public class DemoEnum {
    //Constants: Pi, absolute Zero, weekdays, Month, fingers
    public static final String monday = "MONDAY";
    public static final String tuesday = "TUESDAY";
    public static final String wednesday = "WEDNESDAY";
    public static final String thursday= "THURSDAY";
    public static final String friday= "FRIDAY";
    public static void main(String[] args) {
        System.out.println(DemoEnum.monday);
        //what happens in heap? no objects created. Static variable would not point to object.

        //Before the execution of the main method, it loads enum class. 
        System.out.println(Weekday.MONDAY); //sysout => toString. Enum overrides toString();
        //by default Weekday.class already @Override toString()
        //

        Direction d = Direction.EAST;
        if (d == Direction.SOUTH){  //compare object address directly, doesn't need to concern d.equals(Direction.SOUTH)
            System.out.println("d is south");
        } else {
            System.out.println("d is "+d.toString().toLowerCase()+ ", not South");
        }
    }    
}
