package zoopack;
/**
* INHERITANCE (Subclass and Superclass) demo is done here
* Subclass helps reduce code duplicacy
* Method Overriding @See <class>Penguin</class>
* */
public class Zoo {
    public static void createAnimal() {
        Animal animal1 = new Animal("some animal", 20,null);
        animal1.eat();

        Mammal monkey = new Mammal("Monkey",10,"Brown");
        monkey.run();

        Bird dove = new Bird("Dove", 1, "Gray");
        dove.fly();

        Penguin penguin = new Penguin("PengOne",20,"Black");
        penguin.fly();
    }

    public static void main(String[] args) {
        createAnimal();
    }
}
