package game;
public enum Suit {
    DIAMOND(1),//
    CLUB(2),//
    HEART(3),//
    SPADE(4),//
    ;


    private int rank;

    private Suit(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return this.rank;
    }

    // most instance method should refer to "this"
    // if there is no "this", you may use "static"
    public boolean isHigher(Suit suit){
        return this.rank > suit.getRank();
    }

    public boolean isBigSuit(){
        return this.rank >=2;
    }
    public static boolean isSmallSuit(Suit suit){
        return suit.rank <2;
    }

    public static void main(String[] args) {
        System.out.println(Suit.SPADE.isHigher(Suit.DIAMOND));
        System.out.println(Suit.SPADE.getRank());
        System.out.println(Suit.DIAMOND.getRank());

        Suit currentSuit = Suit.CLUB;
        Suit targetSuit = Suit.DIAMOND;

        if (currentSuit.getRank() > targetSuit.getRank()) {
            System.out.println("Clucky way of expression");
        }
        if (currentSuit.isHigher(targetSuit)){
            System.out.println("Encapsulated in a better readability.");
        }

        // not good
        if (targetSuit.getRank()>=2){
            System.out.println("big suit");
        } else {
            System.out.println("small suit.");
        }

        //Good
        if (targetSuit.isBigSuit()){
            System.out.println("big good");
        } else{
            System.out.println("small good");
        }

        if (isSmallSuit(targetSuit)){
            System.out.println("Small static, readable");
        }
    }
}
