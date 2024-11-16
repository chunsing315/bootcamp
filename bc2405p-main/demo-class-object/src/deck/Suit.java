package deck;

public enum Suit {
  DIAMOND(1), //
  CLUB(2), //
  HEART(3), //
  SPADE(4), //
  ;

  private int rank;

  private Suit(int rank) {
    this.rank = rank;
  }

  public int getRank() {
    return this.rank;
  }

  // most of the instance methods should refer to "this"
  // if there is no "this" keyword in your method, then probably you should
  // consider to use "Static method"
  public boolean isHigherThan(Suit suit) {
    return this.rank > suit.getRank();
  }

  public static void main(String[] args) {
    // why do we have isHigherThan() ?
    Suit currentSuit = Suit.CLUB;
    Suit targetSuit = Suit.DIAMOND;

    // Meaning: comparing their ranking
    if (currentSuit.getRank() > targetSuit.getRank()) {

    }

    if (currentSuit.isHigherThan(targetSuit)) {

    }

  }
}
