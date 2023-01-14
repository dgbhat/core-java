package generics.codewithjohnexample;

import generics.codewithjohnexample.util.Animal;

public class BoundedGenericPrinter<T extends Animal> {
    T value;

    public BoundedGenericPrinter(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);

        //We now have access to eat() as the generics extend Animal
        value.eat();
    }
}
