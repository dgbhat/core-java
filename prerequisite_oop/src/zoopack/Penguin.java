package zoopack;
/**
 * Method Overriding
 * */
public class Penguin extends Bird{

    public Penguin(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void fly() {
        System.out.println(name + " Not able to fly :( ");
    }
}
