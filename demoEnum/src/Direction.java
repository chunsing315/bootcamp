public enum Direction {
    EAST("E",1), WEST("W",-1), SOUTH("S",2), NORTH("N",-2);

    // advantage: present relationship (sometimes), among enum objects
    private int code;
    private String description;

    private Direction(String description, int code){
        this.description = description;
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }


    public boolean isOpposite(Direction direction){
        return this.code*-1 == direction.getCode() ;
    }
    
    public  Direction opposite(){
        for (Direction direction : Direction.values()){
            if (direction.getCode() == this.code*-1){
                return direction;
            } 
            
        }
        return null;
    }


    public static Direction opposite(Direction dir){
        for (Direction d : Direction.values()){
            if (d.getCode() == dir.getCode()*-1){
                return d;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Direction d1 =  Direction.EAST;
        d1 = Direction.WEST;

        for (Direction c : values() ){
            System.out.println(c.name()+" is opposite to...");
            System.out.println("EAST? "+c.isOpposite(Direction.EAST));
            System.out.println("NORTH? "+c.isOpposite(Direction.NORTH));
            System.out.println("WEST? "+c.isOpposite(Direction.WEST));
            System.out.println("SOUTH? "+c.isOpposite(Direction.SOUTH));
        }

        System.out.println(Direction.EAST.opposite());
        System.out.println(opposite(Direction.EAST));
        System.out.println(opposite(Direction.NORTH));

    }
}
