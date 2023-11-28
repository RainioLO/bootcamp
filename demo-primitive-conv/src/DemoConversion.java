public class DemoConversion {
    public static void main(String[] args) {

        // byte -> short -> int -> long

        byte b = 2;
        short s1 = b; // ok, upcast, no precision loss
        int i1 = s1; // OK
        long l1 = i1; // OK

        // long -> int -> short ->byte
        long l2 = 4L;
        // short s2 = l2; //NOT OK, potentially precision loss
        short s2 = (short) l2; // (short) 強行換 Fixed, risky
        l2 = 40000; // 40000 -> int value
        s2 = (short) l2;
        System.out.println("s2=" + s2); // -25536

        short s3 = 130;
        byte b2 = (byte) s3; // overflow // it is downcast risky
        System.out.println("b2=" + b2); // -126

        int i2 = 130;
        short s4 = (short) i2;

        byte b3 = 127;

        float f1 = (float) 1.3d; // downcast
        double d1 = 5.2f; // upcast

        float f2 = 3.5f;
        long l3 = (long) f2; // downcast
        float f3 = 10L; // upcast float --> long

        // char vs int int --> char
        int i3 = 'a'; // 97 char -> int upcast
        int i4 = 65610;
        char c3 = (char) i4; // downcast
        System.out.println("c3 (int)=" + (int) c3); // 74
        System.out.println("c3 (char)=" + c3); // J, char overflow will not go to negative



    }
}
