package zoopack2;

public class Dove extends Bird implements Flyable{

    public Dove(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void fly() {
        System.out.println("Dove Flying high! ");
    }
}
