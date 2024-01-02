package lambda;

public enum Subject {

  // enum attributes
  CHINESE("Chin"), ENGLISH("Eng"), MATH("Math"), PHYSICS("Phy"),;

  private String desc;

  private Subject(String desc) {
    this.desc = desc;
  }

  public String getDesc() {
    return this.desc;
  }


}
