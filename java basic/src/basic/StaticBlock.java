package basic;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("System.console().readLine()");
    }

    static {
        System.out.println("System.console().readLine() static");
    }
}
