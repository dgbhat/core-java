package basic;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        printingArray();
        initializingArray();
        sortingArrays();
        compareArrays();
        fillArrays();
    }

    static void printingArray() {
        /*
        simplest way to print array in java
        */

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
        numbers = new int[10]; // instantiation and initialization

        /*with values*/
        float[] floatNumbers;
        floatNumbers = new float[] { 1.02f, 0.03f, 4f };
    }

    static void sortingArrays() {
        char[] chars = {'c', 'a', 'd', 'e'};
        Arrays.sort(chars);
        System.out.println(chars);
    }

    static void compareArrays() {
        int[] numbers1 = { 1, 2, 5, 8 };
        int[] numbers2 = { 1, 2, 5 };
        int[] numbers3 = { 1, 2, 5, 8 };

        System.out.println(Arrays.equals(numbers1, numbers2)); //"false"
        System.out.println(Arrays.equals(numbers1, numbers3)); //"true"
    }

    static void fillArrays() {
        int size = 10;
        char[] characters = new char[size];
        /*
        fill(array[], int fromIndex, int toIndex, valueToBeFilled)
        */
        Arrays.fill(characters, 0, size / 2, 'A');
        Arrays.fill(characters, size / 2, size, 'B');
        System.out.println(Arrays.toString(characters));
        //[A, A, A, A, A, B, B, B, B, B]

        /*
        using copyOf
        copyOf(originalArray[], int newLength)
        */
        char[] newCharArray = Arrays.copyOf(characters, 5);
        char[] newCharArray2 = Arrays.copyOf(characters, 15);
        System.out.println(Arrays.toString(newCharArray));
        //[A, A, A, A, A]
        System.out.println(Arrays.toString(newCharArray2));
        //[A, A, A, A, A, B, B, B, B, B,  ,  ,  ,  ,  ]
    }

}


/*
Some methods from "Arrays" class @java.utils
* */