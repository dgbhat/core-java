package human;

public class Human2 {
    String name = "David";
    int age = 12;
    int height = 130;
    String eyeColor = "Black";

    public Human2(String name, int age, int height, String eyeColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My height is " + height);
        System.out.println("My eye color is " + eyeColor);

        System.out.println("My name is " + this.name);
        System.out.println("My age is " + this.age);
        System.out.println("My height is " + this.height);
        System.out.println("My eye color is " + this.eyeColor);
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
