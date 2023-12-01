public class Shops {


  private String name;
  private double area;

  public Shops(String x, double y) {

    this.name = x;
    this.area = y;
  }

  public Shops(String x) {

    this.name = x;

  }

  public Shops(double y) {

    this.area = y;
  }

  public Shops() {

  }


  public void setName(String x) {

    this.name = x;
  }

  public void setArea(double x) {

    this.area = x;
  }

  public String getName() {

    return this.name;
  }

  public double getArea() {

    return this.area;
  }



  public static void main(String[] args) {


    Shops s1 = new Shops();
    s1.setName("ABC Shop");
    s1.setArea(10000);
    System.out.println("Shop Name: " + s1.getName() + " / " + "Area (m2): " + s1.getArea());

    Shops s2 = new Shops("CFJG Bakery", 294.98);
    System.out.println("Shop Name: " + s2.getName() + " / " + "Area (m2): " + s2.getArea());

    Shops s3 = new Shops(3842.87);
    s3.setName("UX Cinema");
    System.out.println("Shop Name: " + s3.getName() + " / " + "Area (m2): " + s3.getArea());

  }



}
