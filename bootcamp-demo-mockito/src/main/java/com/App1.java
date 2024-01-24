package com;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App1 {

    private App2 app2;

    public App1(App2 app2) {
        this.app2 = app2;
    }

    // Developer A
    public int add(int x, int y) {

        // for unit test, we should mock the external call
        // because we dont want the test code of this method
        int result = this.app2.provider(x * 2, y); // only to know whether can add 1000 with an assumed result
        // other developer wont know the result to be used here

        if (x > 10 && y < 20)
            return result + 1000;
        return result + 500;
        // other class call static its static method
        // assume proovider(x * 2 , y) return 5, 1005
        // assume proovider(x * 2 , y) return 1000, 2000
        // assume proovider(x * 2 , y) return -1, 1999

        // isolation of the provider content app2.provider
        // not care if the provider finished or not

    }

    public String firstCharacter(List<String> strings) {
        // char result = this.app2.encode('c');
        StringBuilder sb = new StringBuilder();
        char encoded;
        for (String s : strings) {
            encoded = this.app2.encode(s.charAt(0));
            sb.append(encoded);
        }
        return sb.toString();
    }

    // Developer A
    public int multiply(int x, int y) {
        return this.app2.provider(x, y) + this.app2.provider2(x, y);
    }

}
