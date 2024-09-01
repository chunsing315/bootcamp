package deck;

public class Card {
    private static String[] suits = new String[] {"DIAMOND","CLUB","HEART","SPADE"};
    private static String[] ranks = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String rank;
    private String suit;

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit= suit;
    }

    public String toString(){
        return "Card ("         + "" + this.suit + " " + this.rank+ ")";
    }


    public static void main(String[] args) {
        Deck deck = new Deck();
        ShuffleManager sm1 = new ShuffleManager(deck.getCards());
        sm1.shuffle(999);
        Card[] cards = deck.getCards(); // 
        int i = 0;
        for (Card card: cards){
            System.out.println(++i+" "+card);
        }


    }
}
