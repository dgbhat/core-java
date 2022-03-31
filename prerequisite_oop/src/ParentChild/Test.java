package ParentChild;

import org.omg.CORBA.Object;

public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent p2 = new Child();
        p.m1();
        c.m1();
        p2.m1();
        /*Parent
        Child
        Child*/
    }
}


class Parent{
    Parent m1() {
        System.out.println("Parent");
        return this;
    }
}

class Child extends Parent{
    Parent m1() {
        System.out.println("Child");
        return this;
    }
}