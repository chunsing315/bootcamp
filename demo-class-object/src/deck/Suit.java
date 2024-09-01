package deck;

public enum Suit {
    DIAMOND(1),//
    CLUB(2),//
    HEART(3),//
    SPADE(4),//
    ;


    private int value;

    public int getValue(){
        return this.value;
    }

    public boolean isHigher(Suit suit){
        if (this.value > suit.getValue()){
            return True;
        }
        return False;
    }

    public static void main(String[] args) {
        System.out.println(Suit.DIAMOND.isHigher(Suit.CLUB));
    }
}
