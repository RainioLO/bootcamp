import java.util.Arrays;
import java.util.Random;

public class Deck {

  private Card[] cards;

  private Deck(int numberOfCards) {
    this.cards = new Card[numberOfCards];
    int idx = 0;
    for (Suit s : Suit.values()) { // loop the enum
      for (Rank r : Rank.values()) {
        this.cards[idx++] = new Card(r, s);
      }
    }
  }

  private static Deck ofPocker() {
    return new Deck(52);
  }

  // @Override
  // public String toString() {

  // return Arrays.toString(this.cards);
  // }


  public static void main(String[] args) {

    Deck deck = Deck.ofPocker();
    System.out.println(Arrays.toString(deck.cards));

    Deck shuffledDeck = deck; // Create a copy of the original deck

    for (int i = 0; i < 100; i++) {
        shuffledDeck.oeverhand();
    }
    System.out.println(Arrays.toString(deck.cards));


  }


  public void oeverhand() {
    Random random = new Random();
    int shuffleIndex = random.nextInt(cards.length);

    Card[] shuffledDeck = new Card[cards.length];
    int destinationIndex = 0;

    for (int i = shuffleIndex; i < cards.length; i++) {
      shuffledDeck[destinationIndex++] = cards[i];
    }
    for (int i = 0; i < shuffleIndex; i++) {
      shuffledDeck[destinationIndex++] = cards[i];
    }
    this.cards = shuffledDeck;
  }

  public void riffle() {



  }



}


