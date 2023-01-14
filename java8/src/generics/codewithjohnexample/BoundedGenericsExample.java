package generics.codewithjohnexample;

import generics.codewithjohnexample.util.Cat;

public class BoundedGenericsExample {
    public static void main(String[] args) {
        BoundedGenericPrinter<Cat> boundedGenericPrinter = new BoundedGenericPrinter<>(new Cat("John cat"));
        boundedGenericPrinter.print();
    }
}
