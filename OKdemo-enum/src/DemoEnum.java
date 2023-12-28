public  DemoEnum {


  public static void main(String[] args) {
    // Color
    String color = "RED";
    color = "RED";
    color = "Red";
    color = "red";

    // 


  }


  public static int convert(String color) {
    if (color.replace(" ", "").toUpperCase().equals("RED"))
      return 1;
    return 2;
  }




}
