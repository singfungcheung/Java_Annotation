@VeryImportant // Create VeryImportant.java
public class Cat {

    String name;
    int age;

    public Cat(String name) {this.name = name;}

    @RunImmediately(times = 3)
    public void meow() {System.out.println("Meow!");}

    public void eat() {System.out.println("Munch");}
}
