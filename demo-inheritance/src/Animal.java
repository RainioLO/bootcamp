public class Animal { // abstract

    private int age; // they are common attributes in other class too.

    public Animal(int age) {
        this.age = age;
    } // now no empty constructor, as we set one constructor ---> Cat class will have error


    // By setter and getter to access this Animal object
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

