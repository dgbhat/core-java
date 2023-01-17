package lambda;

import lambda.codewithjohnexample.LambdaExample;

/**
 * @lambda is a short way of creating an object of a FunctionalInterface
 *
 * @FunctionalInterface lambda can only be used with FunctionalInterface
 * @FunctionalInterface is an interface with one method
 * @FunctionalInterface annotation is not mandatory. However, annotation will enforce the interface to contain single method
 *
 * @lambda returns an object (not a function)
 * @lambda is defined with a single anonymous function with or without return value. This function shall provide the implementation for the method in the FunctionalInterface
 */

public class HelloLambdas {
    public static void main(String[] args) {
        System.out.println("Hey to the lambda!");

        LambdaExample.example();
    }
}
