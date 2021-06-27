package basic;

import someotherpackage.ExampleClass;

public class LearningMethods {
    public static void main(String[] args) {
        MyUtils.sum2Numbers(10,5);
        System.out.println(MyUtils.add10(100) + 50);
        ExampleClass.doSomething();
        MyUtils.utilsVariable = 1;
        System.out.println(MyUtils.utilsVariable);
    }
}
