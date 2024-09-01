package game;
public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit,Rank rank){
        this.suit=suit;
        this.rank=rank;
    }
    
    
    @Override
    public String toString(){
        return "Card("//
        +" suit = " + this.suit//
        +" rank = " + this.rank;
    }


    public Suit getSuit() {
        return suit;
    }


    public void setSuit(Suit suit) {
        this.suit = suit;
    }


    public Rank getRank() {
        return rank;
    }


    public void setRank(Rank rank) {
        this.rank = rank;
    }
// early return coding style

//"or" style
    public boolean isHigherThan(Card card){
        if (this.rank.isHigherThan(card.getRank()))
            return true;
        if (this.rank == card.getRank() && this.suit.isHigher(card.getSuit())) //if rank the same, then compare
            return true;
        return false; // base condition " most likely " 
    }
}