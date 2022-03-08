package basic;

public class RelationalOperators {
    public static void main(String[] args) {
        Q1();
        Q2();
    }

    static void Q1() {
        int number = 1000;
        boolean result = number + 10 > number + 9;
        // 1010 > 1009 is true
        boolean result2 = number + 10 == 1010;
        //true
    }

    static void Q2() {
        int number = 150;
        boolean result = number > 100 && number < 200;
        //true
    }
}



/*
Q1: precedence
relational operators have lesser priorities than arithmetic operators

Q2: precedence
relational operators have a higher priority than logical operators

* */



/*
== (equal to)
!= (not equal to)
> (greater than)
< (less than)
* */