package deck;

import java.util.Random;

// attribute / Dependency
public class ShuffleManager {
    private static String[] suits = new String[] {"DIAMOND","CLUB","HEART","SPADE"};
    private static String[] ranks = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private Card[] cards;
    //player, deck, card, 

    private static int length = suits.length*ranks.length;
    public ShuffleManager(Card[] cards){
        this.cards = cards;
    }

  public void shuffle(int times){
        Card[] newCards = new Card[length];
        for (int k = 0 ; k < times; k++){
            int idx = new Random().nextInt(length);   
            System.out.println(idx);
            int count= 0;
            for (int i = idx; i < length; i++){
                newCards[count++] = this.cards[i];
            };
            for (int j = 0 ; j < idx; j++){
                    newCards[count++] = this.cards[j];
            };
            this.cards = newCards;
        }


    }    
}
