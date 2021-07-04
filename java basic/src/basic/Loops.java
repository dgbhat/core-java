package basic;

/*
for (initialization; condition; modification) {
    // do something
}
* */

public class Loops {
    public static void main(String[] args) {
        Q1(); Q3();
    }

    static void Q1() {
        int i = 10;
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    static void Q2() {
        for (; ; ) {
            //whatever
        }
    }

    static void Q3() {
        int i = 0;
        for (int k = 0; k < 20; k++) {
            i = i++;
        }
        System.out.println(i);
    }

}


/*
Q1: Skipping parts
It is possible to declare a variable outside the loop:

Q2: simple infinite loop

Q3:
whats output?





ANSWER:
Q3: 0
* */