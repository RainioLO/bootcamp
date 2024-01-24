package com;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;
import static model.UppercaseStringMatcher.*;

public class AppTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    // Compare int, String
    @Test
    void testIntegerString() {
        int actual = 45;
        assertThat(actual, equalTo(45));
        assertThat(actual, is(not(equalTo(44))));

        String actual2 = "hello";
        assertThat(actual2, equalTo("hello"));
        assertThat(actual2, not(equalTo("helloo")));
        assertThat(actual2, containsString("ll"));
        assertThat(actual2, not(containsString("abc")));

        String emptyString = "";
        assertThat(" ", not(emptyString()));
        assertThat(emptyString, emptyString());
        assertThat(null, not(emptyString()));

        assertThat(actual2, allOf((not(emptyString())), equalTo("hello"),
                startsWith("h"), endsWith("o")));
    }

    @Test
    void testNullValue() {
        String actual = null;
        assertThat(actual, nullValue()); // static import

        String actual2 = "hello";
        assertThat(actual2, nullValue());
    }

    @Test
    void testSameObject() {
        String s1 = "hello";
        String s2 = "hello";
        assertThat(s1, sameInstance(s2));

        String s3 = new String("hello");
        assertThat(s2, sameInstance(s3));
    }

    @Test
    void testAllEvents() {
        int result = 48; // call main code
        assertThat(result, allOf(greaterThan(47), lessThan(50),
                greaterThanOrEqualTo(48), lessThanOrEqualTo(48)));

        String actual = "world";
        assertThat(actual, anyOf(equalTo("hello"), equalTo("world")));

        Character character = Character.valueOf('D');
        assertThat(character, allOf(not(equalTo('E')), equalTo('D')));
    }

    @Test
    void testAllRangeOfResult() {
        int result = 48;
        assertThat(result, greaterThan(47));

    }

    @Test // most important in harmcrest
    void testCollection() {
        List<String> strings =
                new ArrayList<>(List.of("John", "Peter", "Jenny"));
        assertThat(strings, hasItems("Peter"));
        assertThat(strings, hasItems("Peter", "Jenny"));
        assertThat(strings, not(hasItems("Peters")));
        assertThat(strings, hasSize(3));
        assertThat(strings, contains("John", "Peter", "Jenny")); // contains in order, and all items
        assertThat(strings, containsInAnyOrder("Jenny", "Peter", "John"));
        assertThat(strings, not(containsInAnyOrder("Peter", "John")));

        // what is the difference between contains() and hasIteams()
        // 1. contains() -> & containsInAnyOrder() -> with all items
        // 2. hasItems() -> with specific items only, no ordering

        assertThat(strings.size(), allOf(lessThan(5), greaterThan(0)));
    }

    @Test
    void testArray() {
        String[] strings = new String[3];
        strings[0] = "John";
        strings[1] = "Ken";
        strings[2] = "Steven";

        assertThat(strings, arrayContaining("John", "Ken", "Steven"));
        assertThat(strings, not(arrayContaining("Ken", "Steven")));
        assertThat(strings, not(arrayContaining("Ken", "Steven", "John")));

        assertThat(strings, arrayContainingInAnyOrder("Ken", "Steven", "John"));
        assertThat(strings, not(arrayContainingInAnyOrder("Ken", "Steven")));
    }

    @Test
    void testTolerance() {
        double tolerance = 0.01d;
        double actual = 3.1415d;
        assertThat(actual, closeTo(3.141450, tolerance));
        assertThat(actual, not(closeTo(3.131450, tolerance)));
        assertThat(actual, closeTo(3.151, tolerance));
    }



    @Test
    void testObject() {
        // let the pointer to the heap momory
        Object obj = "hello"; // this Object no String method, ploymorphism
        System.out.println(obj); // toString -> is the Object toString, an address... cannot use String class toString(F)

        // Assert instnceOf()
        assertThat(obj, instanceOf(String.class)); // true
        assertThat(obj, not(instanceOf(Integer.class)));
        if (obj instanceof String) { // need to know it is the String -> so that can use the method
            String s = (String) obj; // risky if upcast, because it may be other class, therefore need to ckeck before.
        }

        // obj = 1000; // Integer.class
        // if (obj instanceof Integer) {
        // Integer i = (Integer) obj; // prepare the Integer house -> so that safe
        // }
    }

    @Test
    void testAnimal() {
        Animal animal1 = Animal.get(3);
        assertThat(animal1, instanceOf(Dog.class));

        Animal animal2 = Animal.get(10);
        assertThat(animal2, instanceOf(Cat.class));
    }

    @Test
    void testCompatible() {

        assertThat(Dog.class, typeCompatibleWith(Animal.class));
        assertThat(Dog.class, typeCompatibleWith(Object.class));
        assertThat(Dog.class, not(typeCompatibleWith(Integer.class)));
        assertThat(Animal.class, not(typeCompatibleWith(Dog.class)));
        assertThat(Dog.class, not(typeCompatibleWith(Cat.class)));
    }

    @Test
    void testCustomMatcher() {
        String result = "HELLO";
        assertThat(result, containsUpperCaseOnly());
        assertThat("hello", not(containsUpperCaseOnly()));
        assertThat("HEllO", not(containsUpperCaseOnly()));
    }

    @Test
    void testRegularExpression() {
        assertTrue("092358".matches("[0-9]+"));
        assertTrue("092358".matches("[0-9]*"));

        String emailRegx =
                "^[A-Za-z0-9._-] + [A-Za-z0-9]\\@[A-Za-z0-9-]+\\.[A-Z|a-z]{2,}$";

        assertTrue("abc@gmail.com".matches(emailRegx));
        assertTrue("a.-_bc@gmail.com".matches(emailRegx));



    }
}
