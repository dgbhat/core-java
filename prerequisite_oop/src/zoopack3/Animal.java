package zoopack3;
/**
 * ABSTRACT CLASS
* */
public abstract class Animal {
    String name;
    int weight;
    String color;

    public Animal(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " is Eating..");
    }

    public void sleep() {
        System.out.println(name + " is Sleeping..");
    }

    public abstract void move();
}
