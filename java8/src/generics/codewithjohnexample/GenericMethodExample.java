package generics.codewithjohnexample;

import generics.codewithjohnexample.util.Animal;
import generics.codewithjohnexample.util.Cat;
import generics.codewithjohnexample.util.Dog;

public class GenericMethodExample {
    public static void example() {
        //1
        genericMethod(5);
        genericMethod("MadMan");
        genericMethod(new Dog("Wooyoo"));

        //2
        genericMethod2(new Dog("Wooyoo"), new Cat("Mocha"));

        //3
        String str = genericMethod3("crazyThing");
        System.out.println(str);

        //4
        genericMethod4(new Dog("Wooyoo"));
    }

    static <T> void genericMethod(T thing) {
        System.out.println("This is " + thing);
    }

    static <T, U> void genericMethod2(T thing1, U thing2) {
        System.out.println("This is " + thing1 + " and " + thing2);
    }

    static <T> T genericMethod3(T thing) {
        return (T) (thing + " is the returned thing");
    }

    static <T extends Animal> void genericMethod4(T thing) {
        thing.eat();
    }
}
