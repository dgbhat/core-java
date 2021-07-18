package basic;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        printingArray();
        initializingArray();
    }

    static void printingArray() {
        /** simplest way to print array in java */

        /*Simple Array*/
        String[] array = new String[] {"John", "Mary", "Bob"};
        System.out.println(Arrays.toString(array));

        /*Nested Array:*/
        String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
        System.out.println(Arrays.toString(deepArray));
        //output: [[Ljava.lang.String;@106d69c, [Ljava.lang.String;@52e922]
        System.out.println(Arrays.deepToString(deepArray));
    }

    static void initializingArray() {
        /*with default values*/
        int[] numbers; // declaration
        numbers = new int[10]; // instantiation and initialization with default values

        /*with values*/
        float[] floatNumbers; // declaration
        floatNumbers = new float[] { 1.02f, 0.03f, 4f }; // instantiation and initialization
    }
}
