public class Point {
  
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;


  }



  public static void main(String[] args) {
    
    Point p1 = new Point (2, 3);
    Point p2 = new Point (2, 3);
    System.out.println(p1.equals(p2));



  }



}
