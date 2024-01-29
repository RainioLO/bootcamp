package com;

import static org.junit.jupiter.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    // round 1 makes the project fail
    @Test
    public void testConcat(){
        String base = "hello";
        App app = new App();
        app.setBase(base);
        assertEquals("helloworld", new App().concat("world"));
    }

    // round 2 makes the project fail
    @Test
    public void testConcat2(){
        String base = null;
        App app = new App();
        app.setBase(base);
        // assertEquals("helloworld", new App().concat("world"));
        assertThrows(IllegalArgumentException.class, () -> app.concat("world"));
        
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
