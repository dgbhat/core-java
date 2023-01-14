package generics.codewithjohnexample;

import generics.codewithjohnexample.util.BoundedGenericPrinter;
import generics.codewithjohnexample.util.Cat;

public class BoundedGenericsExample {
    public static void example() {
        BoundedGenericPrinter<Cat> boundedGenericPrinter = new BoundedGenericPrinter<>(new Cat("John cat"));
        boundedGenericPrinter.print();
    }
}
