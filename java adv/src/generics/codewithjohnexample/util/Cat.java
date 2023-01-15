package generics.codewithjohnexample.util;

public class Cat extends Animal{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }

    @Override
    public void eat() {
        System.out.println(name + " eating");
    }
}
