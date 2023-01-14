package generics.codewithjohnexample.util;

import generics.codewithjohnexample.util.Animal;

public class BoundedGenericPrinter<T extends Animal> {
    T thing;

    public BoundedGenericPrinter(T thing) {
        this.thing = thing;
    }

    public void print() {
        System.out.println(thing);

        //We now have access to eat() as the generics extend Animal
        thing.eat();
    }
}
