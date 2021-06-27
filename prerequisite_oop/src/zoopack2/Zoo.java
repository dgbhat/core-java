package zoopack2;

/**
* INTERFACES : A common utility containing list of methods without implementation. The classes that IMPLEMENT the interface must implement all these methods
* INTERFACES @See <class>Bird</class> and <class>Dove</class> and <class>Penguin</class>
* */
public class Zoo {
    public static void createAnimal() {
        Animal animal1 = new Animal("some animal", 20,null);
        animal1.eat();

        Mammal monkey = new Mammal("Monkey",10,"Brown");
        monkey.run();

        /* Now fly() is not available to penguin since <class>Bird<class> is not implementing <interface>flyable<interface> */
        Bird dove = new Bird("Dove", 1, "Gray");
//        dove.fly();

        /* fly() is available to <class>Dove<class> because it implements Flyable interface*/
        Dove newDove = new Dove("Dove", 1, "Gray");
        newDove.fly();

        /* Now fly() is not available to penguin since <class>Penguin<class> is not implementing <interface>flyable<interface> */
        Penguin penguin = new Penguin("PengOne",20,"Black");
//        penguin.fly();
    }

    public static void main(String[] args) {
        createAnimal();
    }
}
