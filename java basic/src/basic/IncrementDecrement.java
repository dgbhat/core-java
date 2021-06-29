package basic;

/*
prefix (++n or --n) increases/decreases the value of a variable before it is used;
postfix (n++ or n--) increases/decreases the value of a variable after it is used;
*/

import java.util.Scanner;

public class IncrementDecrement {
    static void postfix() {
        int a = 4;
        int b = a++;

        System.out.println(a); // 5
        System.out.println(b); // 4
    }

    static void prefix() {
        int a = 4;
        int b = ++a;

        System.out.println(a); // 5
        System.out.println(b); // 5
    }

    static void Q1() {
        int a = 4;
        System.out.println(a++ + a);
    }

    static void Q2() {
        int a = -1;
        System.out.println(1 - a++);
    }

    static void Q3() {
        int n = 10;
        n--;
        System.out.println(n++);
    }

    static void Q4() {
        System.out.println("Enter input..(10 11 -2 -3)");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            int number = scanner.nextInt();
            System.out.print(--number + " ");
        }
        /* OR
        String[] input = scanner.nextLine().split(" ");
        for (String n : input) {
            int num = Integer.valueOf(n);
            System.out.print(--num + " ");
        }
        */
    }

    public static void main(String[] args) {
        postfix();
        prefix();
        Q1();
        Q2();
        Q3();
        Q4();
    }
}



/*
Q1 = 9

Q2 = 2

Q3 = 9

Q4 = Write a program that reads four numbers and decrements each of them. The program must output the results in the same order separated by spaces.
in: 10 11 -2 -3;
out: 9 10 -3 -4

*/