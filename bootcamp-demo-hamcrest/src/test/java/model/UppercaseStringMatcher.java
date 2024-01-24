package model;

import org.hamcrest.Matcher;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

// this framework no need srtart from 0 can use matcher reuse
public class UppercaseStringMatcher extends TypeSafeMatcher<String> {

  @Override
  public boolean matchesSafely(String item) {
    // regular expression - string pattern description
    return item.matches("[A-Z]+");
  }

  @Override // override the abstract method
  public void describeTo(Description description) { // if fail what message ? // pass by reference, give the reference for you to vchange the object
    description.appendText("The string should contain upper case only");
  }

  public static Matcher<String> containsUpperCaseOnly() {
    return new UppercaseStringMatcher();

  }

}
