package generics.codewithjohnexample.util;

public class Dog extends Animal{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " eating");
    }
}
