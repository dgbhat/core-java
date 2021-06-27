package human;

public class Human {

    /*
    These values will be assigned by default to the created-object
    If not specified like below, DEFAULT VALUES are, string:null, int:0
    */
    String name = "David";
    int age = 12;
    int height = 130;
    String eyeColor = "Black";

    public Human() {
        //Empty constructor OR default constructor
    }

    public void speak() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My height is " + height);
        System.out.println("My eye color is " + eyeColor);
    }

    public void work() {
        System.out.println("Working..");
    }

    public void eat() {
        System.out.println("Eating..");
    }

    public void walk() {
        System.out.println("Walking..");
    }
}
