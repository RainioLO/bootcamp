package com;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;

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
        assertThat(strings, not(hasItems("Peters")));
        assertThat(strings, hasSize(3));

        assertThat(strings.size(), allOf(lessThan(5), greaterThan(0)));
    }

}
