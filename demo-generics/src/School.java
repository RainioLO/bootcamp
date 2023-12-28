public class School<T> {

  private T data;

  public School() {

  }

  public School(T data) {
    this.data = data;
  }

  public T getData() {
    return this.data;
  }



  public static void main(String[] args) {

    School<Integer> noOfRoom = new School<>(100);
    School<String> nameList = new School<>();



  }



}
