public class Bag<T> { // <T> is a scope (now is no scope, can put any class for T)
  // <T> = <T extends Object>

  private T thing;

  public T eat() { // this T cannot be described as it is descriped in class <T> = Object
    return null;
  }

  public static <T> T get(T t) { // <Desctiption of T> for this line only
    return t;
  }


  public static void main(String[] args) {
    Bag<Integer> bag = new Bag<>();
    Bag<Long> bag2 = new Bag<>();

    Bag.get("hello");

  }


}
