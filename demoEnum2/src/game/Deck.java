package game;
public class Deck {
    private Card[] cards;

    public static final int length = Rank.values().length*Suit.values().length;

    public Deck(){
        this.cards = new Card[length];
        int i = 0;
            for (Rank rank: Rank.values()){
                for (Suit suit : Suit.values()){
                    this.cards[i++] = new Card (suit,rank);
                }
            }
        }
    

    public Card[] getCards(){
        return this.cards;
    }

    public static void main(String[] args) {
        Deck d1 = new Deck();
        System.out.println();
    }
}
