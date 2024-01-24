package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class App1SpyTest {

  @Spy
  private App2 app2; // During the unit test, an object app2 is created

  @Test
  void testMultiply() {
    // if we mock provider2, provider is still working normally (due to spy)
    when(app2.provider2(8, 2)).thenReturn(105); // mock the other result
    App1 app1 = new App1(app2);
    int actual = app1.multiply(8, 2); // test our result
    assertEquals(109, actual); // 8/2 + 105
  }

}
