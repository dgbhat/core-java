package generics;

import generics.codewithjohnexample.BoundedGenericsExample;
import generics.codewithjohnexample.GenericMethodExample;
import generics.codewithjohnexample.GenericWildcardExample;
import generics.codewithjohnexample.GenericsClassesExample;

/**
 * 1 Generics with Classes
 * 2 Generics with Methods
 * 3 Wildcards in Generics
 * 4 Bounded Generics
 * */

abstract public class HelloGenerics {
    public static void main(String[] args) {
        System.out.println("Hello Generics!!");

        GenericsClassesExample.examples();
        GenericMethodExample.example();
        GenericWildcardExample.example();
        BoundedGenericsExample.example();
    }
}