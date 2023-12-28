package internalcache;

public class DemoInteger {
  public static void main(String[] args) {

    Integer i1 = 10; // 10 is an int value, autobox to put into Integer
    System.out.println("i1= " + i1);

    Integer i2 = new Integer(10);
    System.out.println("i2= " + i2);

    System.out.println(i1 == i2); // false, "new" is the same object
    System.out.println(i1.compareTo(i2)); // 0, as they are equal
    System.out.println(i1.equals(i2));

    Integer i3 = 10;
    System.out.println(i1 == i3); // true, Integer Cache, same Integer object

    Integer i4 = 127;
    Integer i5 = 127;
    System.out.println(i4 == i5); // true Integetr Cache (-128 to 127)

    Integer i6 = 128;
    Integer i7 = 128;
    System.out.println(i6 == i7); // false, out Integer Cache

    Byte b1 = -128;
    Byte b2 = -128;
    System.out.println(b1 == b2); // true
    Byte b3 = new Byte((byte) 128);
    System.out.println(b1 == b3); // false
    Byte b4 = Byte.valueOf((byte) -128);
    System.out.println(b1 == b4); // true

    Boolean n1 = true;
    Boolean n2 = true;
    System.out.println(n1.equals(n2)); // true
    System.out.println(n1 == n2); // true
    Boolean n3 = new Boolean(true);
    System.out.println(n1 == n3); // false



  }



}
