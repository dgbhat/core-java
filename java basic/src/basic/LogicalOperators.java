package basic;

public class LogicalOperators {
    public static void main(String[] args) {
        Q1();Q2();Q3();
    }

    static void Q1() {
        boolean state = false;
        int n = 0;
        if(!state) System.out.println("false");
        //if(n) { .. } //Error
    }

    static void Q2() {
        boolean b1 = false ^ false; // false
        boolean b2 = false ^ true;  // true
        boolean b3 = true ^ false;  // true
        boolean b4 = true ^ true;   // false
    }

    static void Q3() {
        boolean b = true && !false;
        System.out.println(b); //true

        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = false;
        System.out.println(b1 && b2 || b3); //false
    }
}






/*
Q1:
Integer can not be used in place of boolean in java.

Q2: XOR
XOR (exclusive OR) is a binary operator that returns true if boolean operands have different values, otherwise, it is false.

Q3: Precedence
NOT > XOR > AND > OR

* */


/*
Java has four logical operators
NOT !
AND &&
OR  ||
XOR ^
boolean type are often used in operands

* */