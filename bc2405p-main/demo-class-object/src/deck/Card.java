package deck;

public class Card {

  // private String suit;
  // private String rank;
  private Suit suit;
  private Rank rank;

  // public Card(String suit, String rank) {
  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  // public String getSuit() {
  public Suit getSuit() {
    return this.suit;
  }

  // public String getRank() {
  public Rank getRank() {
    return this.rank;
  }

  // Coding Style: Early Return
  public boolean isHigherThan(Card card) { // when the method is defined small
                                           // enough
    // compare rank first, if they are equal, then compare suit.
    // "OR" relationship
    if (this.rank.isHigherThan(card.getRank()))
      return true; // exit method!!
    if (this.rank == card.getRank() && this.suit.isHigherThan(card.getSuit()))
      return true;
    return false; // base condition ("most likely" fall into)
  }

  @Override
  public String toString() {
    return "Card(" //
        + "suit=" + this.suit //
        + ", rank=" + this.rank //
        + ")";
  }

  public static void main(String[] args) {
    System.out.println(new Card(Suit.CLUB, Rank.NINE)
        .isHigherThan(new Card(Suit.DIAMOND, Rank.JACK))); // false

    System.out.println(new Card(Suit.CLUB, Rank.JACK)
        .isHigherThan(new Card(Suit.DIAMOND, Rank.JACK))); // true

    System.out.println(new Card(Suit.SPADE, Rank.KING)
        .isHigherThan(new Card(Suit.SPADE, Rank.JACK))); // true
  }

}
