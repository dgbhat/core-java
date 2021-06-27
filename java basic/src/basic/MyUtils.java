package basic;

public class MyUtils {
    static int utilsVariable;
    public static void printSomeJunk(String argument){
        System.out.println(argument);
    }
    public static int printSomeJunk(int argument) {
        return argument;
    }
    public static void sum2Numbers(int arg1, int arg2) {
        System.out.println(arg1 + arg2);
    }
    public static int add10(int arg) {
        return arg+10;
    }
}
