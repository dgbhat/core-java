package zoopack2;

public class Mammal extends Animal {

    public Mammal(String name, int weight, String color) {
        super(name, weight, color);
    }

    public void run() {
        System.out.println(name + " is RUNNING..");
    }
}
