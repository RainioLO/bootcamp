import java.util.Random;

public class Monsters {



  String Name;
  int Attack;
  int Defence;
  int HP;

  public Monsters() {

  }

  public Monsters(String Name, int Attack, int Defence, int HP) {

    this.Name = Name;
    this.Attack = Attack;
    this.Defence = Defence;
    this.HP = HP;
  }

  public void printData() {
    System.out.println("Name: " + this.Name);
    System.out.println("Attack: " + this.Attack);
    System.out.println("Defence: " + this.Defence);
    System.out.println("HP: " + this.HP);
  }


  public void randomData() {


    String [] Namelist = new String [] {"John", "May", "Bitch", "Ben", "a", "b", "c"};

    this.Name = Namelist [new Random().nextInt(Namelist.length)];
    this.Attack = new Random().nextInt(100) + 1;
    this.Defence = new Random().nextInt(100) + 1;
    this.HP = new Random().nextInt(100) + 1;


  }

  public int getAttackData() {

    return (this.Attack);

  }



  public static void main(String[] args) {

    Monsters m1 = new Monsters();
    Monsters m2 = new Monsters();
    Monsters m3 = new Monsters();


    m1.randomData();
    m1.printData();
    System.out.print("***********");
    m2.randomData();
    m2.printData();
    System.out.print("***********");
    m3.randomData();
    m3.printData();
    System.out.print("***********");



  }



}
