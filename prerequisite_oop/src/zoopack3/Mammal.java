package zoopack3;

public class Mammal extends Animal {

    public Mammal(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void move() {
        System.out.println(name + " running");
    }

    public void run() {
        System.out.println(name + " is RUNNING..");
    }
}
