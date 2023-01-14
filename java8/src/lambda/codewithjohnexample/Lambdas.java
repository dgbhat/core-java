package lambda.codewithjohnexample;

public class Lambdas {
    public static void main(String[] args) {
        //wo lambda
        Cat cat = new Cat();
        printThing(cat);

        /**
         * WE ARE ELIMINATING the need of a Cat class that implements the Printable interface and then instantiating a Cat object for our use.
         * */
        //wi lambda
        //1
        printThing(
                () -> {
                    System.out.println("Umm, most cats are!");
                }
        );

        //2
        Printable printableLambda = () -> {
            System.out.println("whatever..");
        };
        printThing(printableLambda);

        //3
        Printable printableLambda2 = () -> System.out.println("whatever again..");
        printThing(printableLambda2);

        //4
        Printable2 printable2Lambda = s -> "Cats " + s;
        printThing2(printable2Lambda, "can fly");
    }

    static void printThing(Printable obj) {
        obj.print();
    }

    static void printThing2(Printable2 obj, String s) {
        String result = obj.print2(s);
        System.out.println(result);
    }
}
