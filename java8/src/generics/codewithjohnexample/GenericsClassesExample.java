package generics.codewithjohnexample;

import java.util.ArrayList;

public class GenericsClassesExample {
    public static void main(String[] args) {
        //wo Generics
        Printer printerInteger = new Printer(5);
        printerInteger.print();

        //wi Generics
        //1
        GenericPrinter<Integer> genericPrinterInteger = new GenericPrinter<>(5);
        genericPrinterInteger.print();

        //2
        GenericPrinter<String> genericPrinterString = new GenericPrinter<>("Code with John");
        genericPrinterString.print();

        //3
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
    }
}
