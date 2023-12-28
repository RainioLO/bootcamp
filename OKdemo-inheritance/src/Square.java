public class Square extends Shape {

  private int length;

  public Square (int length) {
    this.length = length;
  }


  @Override
  public double area () {
    return Math.pow(this.length,2); // this.length is int , auto promote to double
  }
  
}
