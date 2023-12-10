package building;

import java.util.Arrays;

public class Family {

  private String familyName;
  private int male;
  private int female;
  private Member[] members = new Member[0];

  public Family() {

  }

  public Family(String familyName, int male, int female, Member[] members) {

    this.familyName = familyName;
    this.male = male;
    this.female = female;
    this.members = members;

  }

  // Setter and Getter

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public void setFemale(int female) {
    this.female = female;
  }

  public void setMale(int male) {
    this.male = male;
  }

  public void setMembers(Member[] members) {
    this.members = members;
  }

  public String getFamilyName() {
    return familyName;
  }

  public int getFemale() {
    return female;
  }

  public int getMale() {
    return male;
  }

  public Member[] getMembers() {
    return members;
  }

  public void addMember(Member newMember) {

    Member[] newmembers = Arrays.copyOf(this.members, this.members.length + 1);
    newmembers[newmembers.length - 1] = newMember;
    this.members = newmembers;

    if (newMember.getGender() == 'M') {
      this.male++;
    }

    if (newMember.getGender() == 'F') {
      this.female++;
    }
  }

  public Member[] deleteMember(Member deleted) {

    Member[] newList = new Member[this.members.length - 1];
    int idx = 0;
    for (int i = 0; i < members.length; i++) {
      if (members[i] != deleted) {
        newList[idx++] = members[i];
      }
    }
    return this.members = newList;
  }

  public double getFamilySalary() {

    double sum = 0;
    for (int i = 0; i < this.members.length; i++) {
      sum += this.members[i].getSalary();
    }
    return sum;
  }

  public int getMemberNo() {

    return this.members.length;

  }

  @Override
  public String toString() {
    return "Family Name: " + familyName + ", Male Count: " + male
        + ", Female Count: " + female + ", Family Member info: "
        + Arrays.toString(members);
  }


  public static void main(String[] args) {

    Member m1 = new Member("Alice Chan", 15, 'F', 20000);
    Member m2 = new Member("Wilson Chan", 35, 'M', 40000);
    Member m3 = new Member("Vick Chan", 22, 'M', 20000);
    Member m4 = new Member("Mary Chan", 40, 'F', 28000);

    Member[] memberFamily1 = new Member[] {m1, m2, m3, m4};

    Family family1 = new Family("Chan", 2, 2, memberFamily1);

    // System.out.println(family1.toString());

    System.out.println("$ " + family1.getFamilySalary());

    Member m5 = new Member("Fok Chan", 4, 'F', 0);
    family1.addMember(m5);

    System.out.println(family1.toString());

    System.out.println("No. of member in " + family1.getFamilyName() + " is "
        + family1.getMemberNo());

    System.out.println("$ " + family1.getFamilySalary());

    System.out.println(family1.getMembers()[1].getName());

  }



}
