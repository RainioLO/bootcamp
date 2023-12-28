package vehicle;
public interface Vehicle { // "Vehicle" is a abstract word.

  // like the abstract class, but without instance variable
  // abstract design need to be careful, it cannot be changed
  // need to 抽離 attributes

  // WHY interface ?????????????
  // We write the methods ourselves !!!!!!!

  // interface has no instance variable
  int x = 10; // implicitly is public static final

  // interface is a contract with 100 % abstract behaviors (methods)
  // by default is abstract method
  // abstract class can some be abstract


  // 全部或沒有
  // if a class implents an interface has to implement all methods or nothing

  // (public abstract void start()) cannot private, cant be called
  boolean start(); // implicitly "public abstract" method

  boolean stop();

  boolean accelerate();

  boolean brake();

  // After Java 8
  // default instance method - backward compatibility

  // Can call or not
  default boolean test() { // backward compatibility
    return false;
  }



  public static void main(String[] args) {


    // Vehicle v = new Vehicle();
    System.out.println(Vehicle.x); // can .x is public static final
    // class can . to get the value.
  }


}
