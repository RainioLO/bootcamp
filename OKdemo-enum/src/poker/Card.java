public class Card {

  private Suit suit;
  private Rank rank;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }


  @Override
  public String toString() {
    return this.suit.toString().concat(this.rank.toString());

  }



}
