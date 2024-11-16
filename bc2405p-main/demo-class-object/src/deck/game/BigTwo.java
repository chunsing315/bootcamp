package deck.game;

import deck.Card;
import deck.Deck;

public class BigTwo {

  public static boolean isFourKind(Card[] cards) {
    return false;
  }

  public static boolean isStraight(Card[] cards) {
    return false;
  }

  public static boolean isFullHouse(Card[] cards) {
    return false;
  }

  public static boolean isRoyalFlush(Card[] cards) {
    return false;
  }

  public static void main(String[] args) {
    // Problem 1: How to design/handle the 2 Joker Card in the classes? (parent
    // class/ interface)
    Deck deck = new Deck(); 
    // Problem 2: 52? rank? Rank.TWO is the highest in Big Two.


  }
}
