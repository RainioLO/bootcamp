public class StringBox {

  private char[] characters; // object reference type char array

  public StringBox(String str) {
    this.characters = new char[str.length()]; // need to be existed
    for (int i = 0; i < str.length(); i++) {
      characters[i] = str.charAt(i);
    }
  }

  public String toString() {
    return String.valueOf(this.characters);
  }

  public boolean isEmpty() { // check if the char [] is empty
    return this.characters.length == 0;
  }

  public int length() { // return the char array length
    return this.characters.length;
  }

  public StringBox concat(String str) {
    int idx = 0;
    char[] newArr = new char[this.characters.length + str.length()];

    for (int i = 0; i < this.characters.length; i++) {
      newArr[idx++] = characters[i];
    }

    for (int i = 0; i < str.length(); i++) {
      newArr[idx++] = str.charAt(i);
    }
    // this.characters = newArr;
    return new StringBox(String.valueOf(newArr));// from char Array to string
    // return this;
  }

  public StringBox concat2(String str) {
    int idx = 0;
    char[] newArr = new char[this.characters.length + str.length()];

    for (int i = 0; i < this.characters.length; i++) {
      newArr[idx++] = characters[i];
    }

    for (int i = 0; i < str.length(); i++) {
      newArr[idx++] = str.charAt(i);
    }
    // this.characters = newArr;
    this.characters = newArr;// from char Array to string
    return new StringBox(String.valueOf(newArr));
  }





  public static void main(String[] args) {
    StringBox string = new StringBox("hello");
    System.out.println(string);
    System.out.println(string.toString());
    string.concat("world");
    System.out.println(string.toString());
    System.out.println(string.concat("world").concat("bitch"));


    StringBox s = new StringBox("hello");
    System.out.println(s.toString());


    StringBox s2 = s.concat("world");
    System.out.println("s2= " + s2.toString());
    System.out.println("s= " + s.toString());

    StringBox s3 = s.concat2("world");
    System.out.println("s3= " + s3.toString());
    System.out.println("s= " + s.toString()); //directly replace s= s3; 
  }



}
