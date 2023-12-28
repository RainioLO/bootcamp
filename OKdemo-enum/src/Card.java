public class Card {

  private String color;

  public Card(String color) {
    this.color = color;
  }


  public static void main(String[] args) {

    String red1 = new String("RED");
    String red2 = new String("RED"); // red1 red2 is not the same object
    Card c1 = new Card(red1);
    Card c2 = new Card(red2);



  }


}
