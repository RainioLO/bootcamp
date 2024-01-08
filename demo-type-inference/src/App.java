import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String s = "hello";
        var s2 = "hello"; // after compile -> var -> String


        // if the object reference is declared bt "var", we have to assign value at the same time
        // var n;


        // s = 123 // error
        // s2 = 123; // error s2 is declared before, and pointing to a String object
        // cannot reassign to int value object.

        var result = add(3, 4);
        System.out.println(result);


        List<Dog> dogs =
                new ArrayList<>(List.of((new Dog("ABC")), (new Dog("DEF"))));

        for (Dog dog : dogs) {
            System.out.println(dog.getName());
        }

        for (var dog : dogs) {
            System.out.println(dog.getName());
        }

        // we cannot use var as return typr

        /*
         * public static var add (int x, int y){ return x + y; }
         *
         */

        // public static int add(var x, var y){
        // return x + y;
        // }

        Map<String, Dog> dogMap = new HashMap<>();
        dogMap.put("John", new Dog("ABC"));


        // Entry is inner class of Map
        for (Map.Entry<String, Dog> entry : dogMap.entrySet()) {

        }

        for (var entry : dogMap.entrySet()) { // Map.Entry
            System.out.println(entry.getKey() + entry.getValue());

        }

        for (var key : dogMap.keySet()) { // String
            System.out.println(key.length());
        }

        for (var value : dogMap.values()) { // Dog
            System.out.println(value.getName());
        }


    }

    public static int add(int x, int y) {
        return x + y;
    }
}
