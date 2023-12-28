package box;

public class Test<T> extends Box<T> { // cannot extend a generics // dont know what test extend to
  // public class Test <U> extends Box <T> // error because may not the same type
  // public class Test extends Box <T> // error
  // public class Test <T> extends Box <T> -- OK
  // public class Test extends Box<String> -- ok , know what things is inherited.
  // have chance that different

  T t;

  public static void main(String[] args) {
    Test<String> test = new Test<>(); //
    // String s = test.t; // object.t can be reached if the Box<T> t is public
    String o = test.t; // small t is also string when we define Test<String>



  }
}
