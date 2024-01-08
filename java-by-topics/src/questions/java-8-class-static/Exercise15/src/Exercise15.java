/**
 * Expected Output:
 * Person1's id : 1
 * Person2's id : 2
 * Person3's id : 3
 * Person's Counter : 3
 * Person6's id : 101
 */
public class Exercise15 {

    private class Person {
        private int id;
        private static int counter = 0;

        // Implement a constructor to update static variable counter + 1,
        // and assign to instance variable id

        // Implement instance method getId() to get id

        // Implement method getCounter() and setCounter() to access and update the
        // static variable counter
    }

    public static void main(String[] args) {
        Person person1 = new Exercise15().new Person();
        Person person2 = new Exercise15().new Person();
        Person person3 = new Exercise15().new Person();

        System.out.println("Person1's id : " + person1.getId()); // prints 1
        System.out.println("Person2's id : " + person2.getId()); // prints 2
        System.out.println("Person3's id : " + person3.getId()); // prints 3
        // The way to call static method: Person.getCounter()
        System.out.println("Person's Counter : " + Person.getCounter()); // prints 3

        Person.setCounter(100);
        Person person6 = new Exercise15().new Person();
        System.out.println("Person6's id : " + person6.getId()); // prints 101
    }

}
