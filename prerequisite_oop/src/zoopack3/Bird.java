package zoopack3;

public class Bird extends Animal {

    public Bird(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void move() {
        System.out.println(name + " Flapping wings");
    }
}
