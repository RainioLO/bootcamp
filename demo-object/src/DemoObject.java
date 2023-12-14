public class DemoObject { // extends Object implicitly

  public void run() {

  }

  public static void main(String[] args) {

    Object o1 = new Object();
    System.out.println(o1.toString());

    // DemoObject do1 = (DemoObject) o1; downcast -> runtime error
    // 因為件衫有這個工具, 指向Object, 身上沒有那個工具。
    // simpler object into sons // downcast
    // compile time -> do1, is a object created with thwe type DemoObject --> able to call run().

    // do1.run(); // compile time can call .run()
    // run time find the tool (.run()) --> refer to the Object --> No tool --> 88
    // runtime -> once do1 found the object( new Object()), there is NO run () method

    DemoObject do2 = new DemoObject();
    Object o2 = do2; // from DemoObject to Object //Upcast
    System.out.println(o2.toString());
    // compile time -> o2 is an object reference with the type of Object. Able to call itself method


    // getClass()

    DemoObject do3 = new DemoObject();

    if (do3.getClass() == DemoObject.class) { // instanceof
      System.out.println("it is DemoObject Class");
    }


    Class<?> clas = do3.getClass();
    System.out.println(clas.getName()); // class DemoObject


    // equals(), hashcode()
    String s1 = "hello";
    String s2 = "abc";
    System.out.println(s1 == s2); // check if the same object ?
    System.out.println(s1.equals(s2)); // check if same value ?

    // String Class
    // public boolean equals(Object anObject) {
    // if (this == anObject) {
    // return true;
    // }
    // return (anObject instanceof String aString)
    // && (!COMPACT_STRINGS || this.coder == aString.coder)
    // && StringLatin1.equals(value, aString.value);
    // }

    // Object Class
    // public boolean equals(Object obj) {
    // return (this == obj);
    // }

    // Cat equals()







  }
}
