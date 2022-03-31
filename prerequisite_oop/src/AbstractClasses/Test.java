package AbstractClasses;

public abstract class Test {
    public abstract void m1();
    public abstract void m2();
}

abstract class SubTest extends Test {
    public void m1() {
        System.out.println("m1");
    }
}

class SubSubTest extends Test {
    public void m1() {
        System.out.println("m1");
    }

    public void m2() {
        System.out.println("m2");
    }
}
