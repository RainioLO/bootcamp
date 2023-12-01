public class DemoWrapper {
    public static void main(String[] args) {
        // int -> Interger(Class)
        int i1 = 3; // (primitive no tools)
        Integer i2 = 3; // 3 is int value -> autoboxing
        int i3 = i2; // auto-unbox

        Integer i4 = new Integer(5);
        Integer i5 = Integer.valueOf(3);

        int result = i4.compareTo(i2); // 1 (5>3)
        System.out.println(result);

        int result2 = i2.compareTo(i4); // -1 3<5
        System.out.println(result2);


        if (i2.compareTo(i4) == 0) { // asking if i2 == i4

        }

        if (i2 == i4) { // unbox the class to compare the 2 int values
        }


        // double -> Double
        double d1 = 1.9d;
        Double d2 = 1.9d; // autobox double to Double
        Double d3 = Double.valueOf(1.9d); // self box, it is a class now
        Double d4 = new Double(1.9);
        Double d5 = Double.valueOf(123458900000L);
        System.out.println(d5);

        // char -> Character
        char c1 = 'a';
        Character c2 = 'a';
        Character c3 = Character.valueOf('a');
        Character c3 = Character.valueOf();
        Character c4 = new Character('a');

        // boolean -> Boolean
        // class to describle the real reality, primitive is used for calculation
        boolean isOkay = true;
        Boolean isPassed = true; // autobox (from boolean to Boolean)
        Boolean isPassed2 = Boolean.valueOf(true); // self box boolean to Boolean
        Boolean isPassed3 = new Boolean(true);


        // long
        Long l1 = 10L; // 10L is long value, autobox from long to Long
        // Long -> Integer, how to fix
        // ONLY Long -> long
        // Only Integer -> int
        // int <-> long
        Integer i10 = (int)(long) l1; // Long -> long -> int -> Integer (i10)

        Long l2 = (long) (int) i10; // Integer -> Int -> long -> Long (l2)


        Double d11 = 1.8d;
        Double d12 = 1.9d;
        if (d2 > d1) { // object compare to object, not good 
            // object must call method
        }
        if (d11.compareTo(d12) == 0) { // double == double  use the tool

        }




        
    }
}
