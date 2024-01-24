package com;

import static org.junit.jupiter.api.Assertions.assertTrue;
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
    }


}
