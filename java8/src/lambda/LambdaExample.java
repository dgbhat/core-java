package lambda;

public class LambdaExample {
    public static void main(String[] args) {
        System.out.println("Hey to the lambda!");
    }
}

/**
 * @lambda is a short way of creating an object of a FunctionalInterface
 *
 * @FunctionalInterface lambda can only be used with FunctionalInterface
 * @FunctionalInterface is an interface with one method
 * @FunctionalInterface is not mandatory to annotate, but annotating will enforce restriction to have only one method in the interface
 *
 * @lambda returns an object (not a function)
 * @lambda is defined with a single anonymous function with or without return value, the function which provides implementation for the method in the FunctionalInterface
 */