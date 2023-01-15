package generics.codewithjohnexample;

import java.util.ArrayList;

/**
 * WILDCARDS
 * You don't know what type reference to pass for the already Generic - ArrayList Class as well!!
 * Kinda generic for a generic!
 */
public class GenericWildcardExample {
    public static void example() {
        //1
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(5);
        wildcardMethod(arrayList3);
    }

    static void wildcardMethod(ArrayList<?> arrayList4) {
        System.out.println(arrayList4);
    }
}
