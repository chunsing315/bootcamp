package deck;
import java.util.Random;

public class Deck {
    private static String[] suits = new String[] {"DIAMOND","CLUB","HEART","SPADE"};
    private static String[] ranks = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    //player, deck, card, 

    private static int length = suits.length*ranks.length;
    private Card[] cards;

    

    public Deck(){
        this.cards = new Card[length];
        int i = 0; 
            for (String suit:suits){
                for (String rank : ranks){
                    this.cards[i++] = new Card(rank,suit);
                }
            }
    }   
    
    public Card[] getCards(){        
        return this.cards;
    }

    // attribute / Dependency
    

    //randomize

  
    
}