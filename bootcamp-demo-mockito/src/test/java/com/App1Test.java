package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Unit test for simple App.
 */
@ExtendWith(MockitoExtension.class)
public class App1Test {
    @Mock
    private App2 dependency; // we didnt create object // just mimic to have this object

    @Test
    void testAdd_Case1() {

        // Case 1: x > 10 && y < 20
        // if someone call dependency.provider(20,19), return -100
        Mockito.when(dependency.provider(22, 19)).thenReturn(0); // assumption // provider is the expected result
        // will not take the actual result as they change we have to change too...
        // test result should not be changed
        App1 app1 = new App1(dependency); // constructor

        int result = app1.add(11, 19); // actual calling (unit test start point)
        assertEquals(1000, result); // the return 100 + the method situation + 1000
    }

    @Test
    void testAdd_Case2() {
        // Case 2: x <= 10 && y < 20
        Mockito.when(dependency.provider(18, 19)).thenReturn(100);
        App1 app1 = new App1(dependency);
        int result = app1.add(9, 19); // 100 + 500
        assertEquals(600, result);

    }

    @Test
    void testAdd_Case3() {
        // Case 3: x <= 10 && y >= 20
        Mockito.when(dependency.provider(18, 20)).thenReturn(100);
        App1 app1 = new App1(dependency);
        int result = app1.add(9, 20); // 100 + 500
        assertEquals(600, result);
    }

    @Test
    void testAdd_Case4() {
        // Case 4: x > 10 && y >= 20
        Mockito.when(dependency.provider(22, 20)).thenReturn(100);
        App1 app1 = new App1(dependency);
        int result = app1.add(11, 20); // 100 + 500
        assertEquals(600, result);
    }

    @Test
    void testFirstCharacter_Case5() {
        when(dependency.encode('a')).thenReturn('B');
        when(dependency.encode('c')).thenReturn('D');
        when(dependency.encode('i')).thenReturn('J');
        when(dependency.encode('j')).thenReturn('K');
        App1 app1 = new App1(dependency); // this dependency is here test
        List<String> strings = new ArrayList<>(List.of("abc", "ijk", "cba", "jba", "jmk"));
        String result = app1.firstCharacter(strings);
        assertEquals("BJDKK", result);

        verify(dependency, times(1)).encode('a');
        verify(dependency, times(1)).encode('i');
        verify(dependency, times(1)).encode('c');
        verify(dependency, times(2)).encode('j');

    }


}
