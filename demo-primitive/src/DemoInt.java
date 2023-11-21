public class DemoInt {
  public static void main(String[] args) {
    // " " -> String
    // numbrer
    System.out.println("2 abc");
    System.out.println(2);
    System.out.println(2.3);

    // monthly salary and i are both "variable"
    int monthlysalary=20000;//set up area ms=20000
    System.out.println("monthlysalary:" +monthlysalary);// "String" 字庫申 +variable --> monthlysalary:20000

    int i=2;
    System.out.println("i:" +i);
    //"int age" -> Declaration, int-."integer"
    // age=30 ->Assignment, assign the integer value 30 to the variable
    int age;
    age=30;
    age= age+i;
    System.out.println("(age+i)years:" +age);


    int level; // Declaration
    level=1; // Assignment
    System.out.println(level); //10
    level=10; //Re-assignment
    // int level; //We cannot re-declare the same variable
    //int sum = (age + level)*i;

System.out.println(level);

    level = level +3; //13
    level += 3; //16

    level = level -7; //9
    level -= 7; //2

    level = level*3; //6
    level *= 3; //18

    level = level/2; //9
    level /= 2; //4 (4.5 cancelled 0.5)
    System.out.println("level:" +level);

    level= level + 1; //5
    level++; //6
    ++level; //7

    level= level -1; //6
    level--; //5
    --level; //4
    System.out.println("level:" +level);

    // the remainder of 5/2 ->1
    int remainder= 5%2; //1
    System.out.println(remainder);

    int result = (5+3)/2%3;
    System.out.println("result=" + result);

    result= 5+3/2%3;
    System.out.println("result=" +result);

    Float Result01= 5+3/2%3f;
    System.out.println ("Result01=" + Result01);

    // byte, short, int, long (primitive) 原始 (不能再解釋)
    byte b = -128; // -128 to 127 (store range)
    byte b2 = 127;
    // byte b3= 128; //128 is out of range of integer value that can be stored by byte

    short s = -32768;
    short s2 = 32767;
    // short s3= 32768;

    int i1 = -2147483648; //int range
    int i2 = 2147483647;
    // int i3 = 2147483648;

    //long l0= 2147483648; //2147483648 is int presentation, out of range of int) 
    long l1 = -9223372036854775808L; // notation L -> long value, if no, int
    int i5 = 100; // The value 100 has no notation -> default it is an int value
    byte b4 = 100; // Java implicity convert int to byte
    short s4 = 100; // Java implicity convert int to short

    l1 = l1 + 10L; //L notation 
    System.out.println(l1); //-9223372036854775798



    
  }
}
