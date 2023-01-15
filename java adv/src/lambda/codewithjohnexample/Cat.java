package lambda.codewithjohnexample;

public class Cat implements Printable, Printable2 {
    String name;
    int age;

    Cat() {}

    @Override
    public void print() {
        System.out.println("Im a stupid cat");
    }

    @Override
    public String print2(String s) {
        return s;
    }
}
