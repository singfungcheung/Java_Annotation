public class Dog {

    String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public void bark()
    {
        System.out.println("Woof!");
    }

    public void myName()
    {
        System.out.println("My name is " + this.name);
    }
}
