public class Human implements HumanBehavior {

  int age;
  char gender;
  double weight = 0;

  public static final double MAX_WEIGHT = 100;
  public static final double MIN_WEIGHT = 0;


  public Human(int age, char gender, double weight) {
    this.age = age;
    this.gender = gender;
    this.weight = weight;

  }


  @Override
  public void eat(double food) {
    if (!isSlept()) {
      this.weight += food;
    } else {
      System.out.println("This person is sleeping. zzzzzzzzzz");
    }
    if (this.weight > MAX_WEIGHT)
      this.weight = MAX_WEIGHT;

  }

  @Override
  public void poo(double poo) {
    this.weight -= poo;
    if (this.weight < MIN_WEIGHT)
      this.weight = MIN_WEIGHT;
  }

  @Override
  public boolean isSlept() {
    if (weight > 50)
      return true;
    return false;
  }



  public static void main(String[] args) {

    Human h1 = new Human(23, 'M', 10);

    h1.eat(3);
    h1.poo(2);
    System.out.println(h1.isSlept());
    h1.eat(50);
    h1.eat(10);

  }


}
